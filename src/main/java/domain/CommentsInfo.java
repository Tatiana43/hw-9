package domain;

public class CommentsInfo {
    private int count;
    private boolean canPost;
    private String emojiUrl;
    private boolean photoAttached;
    private boolean videoAttached;
    private boolean audioAttached;
    private boolean fileAttached;

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public boolean isCanPost() {
        return canPost;
    }

    public void setCanPost(boolean canPost) {
        this.canPost = canPost;
    }

    public String getEmojiUrl() {
        return emojiUrl;
    }

    public void setEmojiUrl(String emojiUrl) {
        this.emojiUrl = emojiUrl;
    }

    public boolean isPhotoAttached() {
        return photoAttached;
    }

    public void setPhotoAttached(boolean photoAttached) {
        this.photoAttached = photoAttached;
    }

    public boolean isVideoAttached() {
        return videoAttached;
    }

    public void setVideoAttached(boolean videoAttached) {
        this.videoAttached = videoAttached;
    }

    public boolean isAudioAttached() {
        return audioAttached;
    }

    public void setAudioAttached(boolean audioAttached) {
        this.audioAttached = audioAttached;
    }

    public boolean isFileAttached() {
        return fileAttached;
    }

    public void setFileAttached(boolean fileAttached) {
        this.fileAttached = fileAttached;
    }
}
