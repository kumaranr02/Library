package com.libraryms.library.dal;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.libraryms.library.model.Member;

@Repository
public class MemberDAO implements IMemberDAO {

    private final Map<String, Member> memberRecords = Collections.synchronizedMap(new HashMap<>());

    @Override
    public void addMember(Member member) {
        memberRecords.put(member.getMemberId(), member);
    }

    @Override
    public List<Member> getAllMembers() {
        return new ArrayList<>(memberRecords.values());
    }

    @Override
    public Member getMemberById(String memberId) {
        return memberRecords.get(memberId);
    }

    @Override
    public void updateMember(Member member) {
        memberRecords.put(member.getMemberId(), member);
    }

    @Override
    public void deletemember(String memberId) {
        memberRecords.remove(memberId);
    }
}
