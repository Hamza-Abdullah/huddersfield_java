package Week_10;

import java.util.ArrayList;
import java.lang.Math;

public class Club {

	//Array list of all the members which are based on the Member class
    private ArrayList<Member> members;

    public Club() {
        this.members = new ArrayList<Member>();
    }

    public Club(ArrayList<Member> members) {
        this.members = members;
    }

    public void addMember(Member newMember) {
        this.members.add(newMember);
    }

    public String toString() {
        String s = "";

        s = "Current Members:\n\n";

        for (Member c: this.members) {
            s += c.toString ();
            s += "\n";
        }

        return s;
    }
    
	//Returns total contribution from all the members in the club
    public int totalCont(){
        int total = 0;

        for (Member m: this.members) {
            total += m.getContribution();
        }
        return total;
    }

	//Returns amount of turkeys that can be bought with the contributions.
	//Type is an integer so it rounds down decimals, which is what we want.
    public int turkeys(){
        int turkeys = this.totalCont()/20;
        return turkeys;
    }

    public static void main(String[] args) {

		//Creates members
        Member gary = new Member("Gary", 27);
        Member tony = new Member("Tony", 21);
        Member rubiya = new Member("Rubiya", 20);
        Member steve = new Member("Steve", 28);

		//Creates new club
        Club myMembers = new Club();

		//Adds members to club
        myMembers.addMember(gary);
        myMembers.addMember(tony);
        myMembers.addMember(rubiya);
        myMembers.addMember(steve);

        System.out.println(myMembers.toString());
        System.out.println("Total contributions: £" + myMembers.totalCont());
        System.out.println("Number of turkeys that can be bought: " + myMembers.turkeys() + " turkeys");
    }
}