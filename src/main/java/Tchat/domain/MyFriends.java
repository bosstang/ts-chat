package Tchat.domain;

public class MyFriends {
    private String id;

    private String myUserId;

    private String myfriendsUserId;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getMyUserId() {
        return myUserId;
    }

    public void setMyUserId(String myUserId) {
        this.myUserId = myUserId == null ? null : myUserId.trim();
    }

    public String getMyfriendsUserId() {
        return myfriendsUserId;
    }

    public void setMyfriendsUserId(String myfriendsUserId) {
        this.myfriendsUserId = myfriendsUserId == null ? null : myfriendsUserId.trim();
    }
}