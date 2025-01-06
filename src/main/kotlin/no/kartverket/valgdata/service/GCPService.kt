package no.kartverket.valgdata.service

import com.google.auth.oauth2.GoogleCredentials
import com.google.cloud.storage.Storage
import com.google.cloud.storage.StorageOptions
import org.springframework.core.io.InputStreamResource
import org.springframework.stereotype.Service
import java.io.ByteArrayInputStream
import org.springframework.http.HttpHeaders
import org.springframework.http.ResponseEntity
import java.nio.channels.Channels

@Service
class GCPService {

    fun getGeoJsonFromDataprodukterBucket(pathInBucket: String): ResponseEntity<InputStreamResource> {

        val jsonKey = System.getenv("GOOGLE_APPLICATION_CREDENTIALS_JSON")
        val credentials = GoogleCredentials.fromStream(ByteArrayInputStream(jsonKey.toByteArray()))
        val storage: Storage = StorageOptions.newBuilder().setCredentials(credentials).build().service

        try {
            val bucketName = System.getenv("VALGDATA_BUCKET_NAME") ?: throw IllegalStateException("Env variable VALGDATA_BUCKET_NAME is not set")

            val blob = storage.get(bucketName, pathInBucket)

            val inputStream = Channels.newInputStream(blob.reader())

            val headers = HttpHeaders()
            headers.add(HttpHeaders.CONTENT_DISPOSITION, "attachment; filename=\"${pathInBucket}\"")

            return ResponseEntity
                .ok()
                .headers(headers)
                .body(InputStreamResource(inputStream))
        } catch (e: Exception){
            return ResponseEntity.notFound().build()
        }

    }
}