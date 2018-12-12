package Week_10;

import java.util.ArrayList;
import java.lang.Math;

public class Club {

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
    
    public int totalCont(){
        int total = 0;

        for (Member m: this.members) {
            total += m.getContribution();
        }
        return total;
    }

    public int turkeys(){
        int turkeys = this.totalCont()/20;
        return turkeys;
    }

    public static void main(String[] args) {

        Member gary = new Member("Gary", 27);
        Member tony = new Member("Tony", 21);
        Member rubiya = new Member("Rubiya", 20);
        Member steve = new Member("Steve", 28);

        Club myMembers = new Club();

        myMembers.addMember(gary);
        myMembers.addMember(tony);
        myMembers.addMember(rubiya);
        myMembers.addMember(steve);

        System.out.println(myMembers.toString());
        System.out.println("Total contributions: £" + myMembers.totalCont());
        System.out.println("Number of turkeys that can be bought: " + myMembers.turkeys() + " turkeys");
    }
}