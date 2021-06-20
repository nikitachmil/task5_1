
data class Pol(
    val id: Int,
    val ownerId: Int,
    val created: Int,
    val question: Int,
    val votes: Int,
    val answers: Answer,
    val anonymous: Boolean,
    val multiple: Boolean,
    val answerIds: Array<Any>?,
    val endDate: Int,
    val closed: Boolean,
    val isBoard: Int,
    val canEdit: Boolean,
    val canVote: Boolean,
    val canReport: Boolean,
    val canShare: Boolean,
    val authorId: Int,
    val photo: Photo,
    val background: Background

        )
