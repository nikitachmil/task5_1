
data class CommentInfo(
    val count: Int,
    var canPost: Boolean,
    val canClose: Boolean,
    val canOpen: Boolean,
) {
    fun update(post: MyPost): Any {
        canPost = false

        return canPost
    }

    fun editComment(
        count: Int = this.count, canPost: Boolean = this.canPost, canClose: Boolean = this.canClose,
        canOpen: Boolean = this.canOpen
    ) {
    }

}