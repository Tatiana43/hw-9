package domain;

public class PostHeader {
    private boolean postPinned;
    private String groupIconUrl;
    private String groupName;
    private String dateAndTime;

    public boolean isPostPinned() {
        return postPinned;
    }

    public void setPostPinned(boolean postPinned) {
        this.postPinned = postPinned;
    }

    public String getGroupIconUrl() {
        return groupIconUrl;
    }

    public void setGroupIconUrl(String groupIconUrl) {
        this.groupIconUrl = groupIconUrl;
    }

    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    public String getDateAndTime() {
        return dateAndTime;
    }

    public void setDateAndTime(String dateAndTime) {
        this.dateAndTime = dateAndTime;
    }
}
