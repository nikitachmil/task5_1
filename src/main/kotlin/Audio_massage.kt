
data class AudioMassage (
    val duration: Int,
    var waveform: Array<MyPost>? = emptyArray<MyPost>(),
    val linkOgg: String,
    val linkMp3: String

)
