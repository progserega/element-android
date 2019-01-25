package im.vector.matrix.android.api.session.room.model.message

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class MessageVideoContent(
        @Json(name = "msgtype") override val type: String,
        @Json(name = "body") override val body: String,
        @Json(name = "info") val info: VideoInfo,
        @Json(name = "url") val url: String? = null
) : MessageContent