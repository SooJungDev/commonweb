package me.crystal.commonweb.post;

public interface CommentSummary {

    String getComment();

    int getUp();

    int getDown();

    default String getVotes() {
        return getUp() + "" + getDown();
    }

   /* @Value("#{target.up +' ' +target.down}")
    String getVotes();*/
}
