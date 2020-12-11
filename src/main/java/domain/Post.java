package domain;

public class Post {
    private int id;
    private String text;
    private String imageUrl;

    private PostHeader postHeader;
    private CommentsInfo commentsInfo;

    private boolean like;
    private int numberOfLikes;
    private boolean repost;
    private int numberOfReposts;
    private String viewEyeUrl;
    private int numberOfViews;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public PostHeader getPostHeader() {
        return postHeader;
    }

    public void setPostHeader(PostHeader postHeader) {
        this.postHeader = postHeader;
    }

    public CommentsInfo getCommentsInfo() {
        return commentsInfo;
    }

    public void setCommentsInfo(CommentsInfo commentsInfo) {
        this.commentsInfo = commentsInfo;
    }

    public boolean isLike() {
        return like;
    }

    public void setLike(boolean like) {
        this.like = like;
    }

    public int getNumberOfLikes() {
        return numberOfLikes;
    }

    public void setNumberOfLikes(int numberOfLikes) {
        this.numberOfLikes = numberOfLikes;
    }

    public boolean isRepost() {
        return repost;
    }

    public void setRepost(boolean repost) {
        this.repost = repost;
    }

    public int getNumberOfReposts() {
        return numberOfReposts;
    }

    public void setNumberOfReposts(int numberOfReposts) {
        this.numberOfReposts = numberOfReposts;
    }

    public String getViewEyeUrl() {
        return viewEyeUrl;
    }

    public void setViewEyeUrl(String viewEyeUrl) {
        this.viewEyeUrl = viewEyeUrl;
    }

    public int getNumberOfViews() {
        return numberOfViews;
    }

    public void setNumberOfViews(int numberOfViews) {
        this.numberOfViews = numberOfViews;
    }
}
