package com.mvc.member.model.service;

import com.mvc.common.SearchCondition;
import com.mvc.member.model.dao.MemberDAO;
import com.mvc.member.model.dto.MemberDTO;
import org.apache.ibatis.session.SqlSession;

import java.util.List;
import java.util.Map;

import static com.mvc.common.Template.getSqlSession;

public class MemberService {

    private MemberDAO memberDAO;
    public List<MemberDTO> selectAllMemberList() {

        SqlSession sqlSession = getSqlSession();
        memberDAO = sqlSession.getMapper(MemberDAO.class);

        List<MemberDTO> allProductList = memberDAO.selectAllMemberList();

        sqlSession.close();

        return allProductList;
    }

    public String selectNewMemberCode() {

        SqlSession sqlSession = getSqlSession();
        memberDAO = sqlSession.getMapper(MemberDAO.class);

        String newMemberCode = memberDAO.selectNewMemberCode();

        sqlSession.close();


        return newMemberCode;
        }

    public List<MemberDTO> selectMembersByPosition(String position) {

        SqlSession sqlSession = getSqlSession();
        memberDAO = sqlSession.getMapper(MemberDAO.class);

        List<MemberDTO> memberList = memberDAO.selectMembersByPosition(position);

        sqlSession.close();

        return memberList;
    }
    public List<MemberDTO> selectMembersByTeam(String team) {

        SqlSession sqlSession = getSqlSession();
        memberDAO = sqlSession.getMapper(MemberDAO.class);

        List<MemberDTO> memberList = memberDAO.selectMembersByTeam(team);

        sqlSession.close();

        return memberList;
    }

    public int insertMember(MemberDTO member) {

        SqlSession sqlSession = getSqlSession();
        memberDAO = sqlSession.getMapper(MemberDAO.class);

        int result = memberDAO.insertMember(member);

        if(result > 0) {
            sqlSession.commit();
        } else {
            sqlSession.rollback();
        }

        sqlSession.close();
        return result;
    }

    public int updateMember(MemberDTO member) {

        SqlSession sqlSession = getSqlSession();
        memberDAO = sqlSession.getMapper(MemberDAO.class);

        int result = memberDAO.updateMember(member);

        if(result > 0) {
            sqlSession.commit();
        } else {
            sqlSession.rollback();
        }

        sqlSession.close();
        return result;
    }

    public int deleteMember(String memberCode) {

        SqlSession sqlSession = getSqlSession();
        memberDAO = sqlSession.getMapper(MemberDAO.class);

        int result = memberDAO.deleteMember(memberCode);

        if(result > 0) {
            sqlSession.commit();
        } else {
            sqlSession.rollback();
        }

        sqlSession.close();
        return result;
    }
}
