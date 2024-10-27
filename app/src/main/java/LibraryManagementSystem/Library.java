package LibraryManagementSystem;

import java.util.ArrayList;
import java.util.List;

public class Library {

    private List<Member> members;

    public Library(){
        this.members = new ArrayList<>();
    }

    public void addMember(String memberId, String memberName){
        Member member = new Member(memberId,memberName);
        members.add(member);
    }

    public Member findMemberById(String memberId){
        for (Member member : members){
            if (member.getMemberId().equals(memberId)){
                return member;
            }
        }

        return null;
    }

}
