package pl.mzelechowski;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Blog implements BlogAction {
    private List<User> users;
    private List<Post> posts;

    public Blog() {
        this.users = new ArrayList<>();
        this.posts = new ArrayList<>();
    }


    @Override
    public void publishPost(int userId, String content) {
        User user = findUser(userId);
        if (user == null) {
            System.out.println("Cannot publish post. User not found!");
        } else {
            System.out.println(user.getNickName() + "posted just now: " + content);
            posts.add(new Post(new Date(), user, content));
        }
    }

    @Override
    public void commentPost(int userId, int postId, String content) {
        User user = findUser(userId);
        if (user == null) {
            System.out.println("Cannot publish comment. User not found!");
            return;
        }
        Post post = findPost(postId);
        if (post == null) {
            System.out.println("Cannot publish comment. Post not found!");
            return;
        }
        System.out.println(user.getNickName() + " commented " + post.getAuthor().getNickName() + "'s post: " + content);
        post.getComments().add(new Comment(new Date(), user, content));
    }

    @Override
    public Post findPost(int postId) {
        for (Post p : posts) {
            if (p.getId() == postId) {
                return p;
            }
        }
        return null;
    }

    @Override
    public User findUser(int userId) {
        for (User u : users) {
            if (u.getId() == userId) {
                return u;
            }
        }
        return null;
    }

    @Override
    public void displayUserEntries(int userId) {
        User user = findUser(userId);
        if (user == null) {
            System.out.println("User not found");
            return;
        }
        System.out.println(user.getNickName() + "'s " + "entries: ");
        for (Post p : posts) {
            if (p.getAuthor().getId() == userId) {
                System.out.println("(POST) " + p.getContent());
            }
            for (Comment c : p.getComments()) {
                if (c.getAuthor().getId() == userId) {
                    System.out.println("(COMMENT) " + c.getContent());
                }
            }
        }
    }
}
