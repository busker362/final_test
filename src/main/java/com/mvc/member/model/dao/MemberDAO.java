package com.mvc.member.model.dao;

import com.mvc.common.SearchCondition;
import com.mvc.member.model.dto.MemberDTO;

import java.sql.Connection;
import java.util.List;
import java.util.Map;

public interface MemberDAO {

    List<MemberDTO> selectAllMemberList();
    String selectNewMemberCode();
    MemberDTO selectOneMemberByCode(String memberCode);
    List<MemberDTO> selectMembersByPosition(String position);
    List<MemberDTO> selectMembersByTeam(String team);

    int insertMember(MemberDTO member);

    int updateMember(MemberDTO member);

    int deleteMember(String memberCOde);
}
