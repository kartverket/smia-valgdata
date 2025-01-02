package no.kartverket.valgdata.service

import com.google.auth.oauth2.GoogleCredentials
import com.google.cloud.storage.Storage
import com.google.cloud.storage.StorageOptions
import org.springframework.core.io.InputStreamResource
import org.springframework.stereotype.Service
import java.io.ByteArrayInputStream
import org.springframework.http.HttpHeaders
import org.springframework.http.ResponseEntity

@Service
class GCPService {

    final val jsonKey = System.getenv("GOOGLE_APPLICATION_CREDENTIALS_JSON")
    final val credentials = GoogleCredentials.fromStream(ByteArrayInputStream(jsonKey.toByteArray()))
    val storage: Storage = StorageOptions.newBuilder().setCredentials(credentials).build().service

    fun getGeoJsonFromDataprodukterBucket(pathInBucket: String): ResponseEntity<InputStreamResource> {
        try {
            val bucketName = System.getenv("VALGDATA_BUCKET_NAME") ?: throw IllegalStateException("Env variable VALGDATA_BUCKET_NAME is not set")

            val blob = storage.get(bucketName, pathInBucket)

            val contentStream = ByteArrayInputStream(blob.getContent())

            val headers = HttpHeaders()
            headers.add(HttpHeaders.CONTENT_DISPOSITION, "attachment; filename=\"${pathInBucket}\"")

            return ResponseEntity
                .ok()
                .headers(headers)
                .body(InputStreamResource(contentStream))
        } catch (e: Exception){
            return ResponseEntity.notFound().build()
        }

    }
}