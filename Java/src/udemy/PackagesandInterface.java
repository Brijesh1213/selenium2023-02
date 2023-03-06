package udemy;

public class PackagesandInterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//packages is a container for class, better to combine classes and create package , here we can sort some type of classes as a one bonth, 
		// we organise our classes,it also provides access control
		//default packages : java.util, java.lang, java.io etc
		//user defined packages : we create package and than classes into it
		//advantage of package < code reuse" w can use multiple classes and organise them by packages
		   //you can have same name classes with different packages
		   //you can hide classes " access modifiers
		// if u have two packages and each have one class with name"Link"...u can call this link package method via import demo.Link...here demo is package name and Link is the class inside hat package that we are calling
		
		
		
		// now Access Specifiers
		   //Private : this will keep the tthings to one calss only, even same package but diff calss cant call privates of the class
		   //Default : member is accessed within the package, ouside pckage transmission is prohibited
		   //Protected : Member is accessible within package only, howeever to make it available for diff packages , one needs tocreate subClass
		// package > phg 2 class  extends calss1(class with protected member pkg1)>  this way pk2 can access protected member of pkg1 class
		   //public: accessible anywhere, within calsses , same or diff packages
		   

	}

}
