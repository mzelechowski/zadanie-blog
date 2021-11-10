package pl.mzelechowski;

public class Main {

    public static void main(String[] args) {
	    Blog blog = new Blog();

	    blog.addUsers(new User("Jan", "Kowalski","Janek03"));
	    blog.addUsers(new User("Katarzyna", "Kowalska","kasiulekSłit"));
	    blog.addUsers(new User("Marek", "JSON","json32"));
	    //blog.getUsers().forEach(System.out::println);

	    blog.publishPost(1, "Lubie Jave, bo da sie zrobić fajną apkę");
	    blog.publishPost(1, "Mimo wszystko lubię też C++");

		System.out.println();
		blog.commentPost(2, 2, "Mówiłam Ci, że C++ jest lepszy.");
		blog.commentPost(1,2,"Dzieki Kasia, też tak uważam");
		blog.displayUserEntries(1);

    }
}
