package com.mvc.team.model.service;//package com.mvc.team.model.service;
//
//import com.mvc.team.model.dao.TeamDAO;
//import com.mvc.team.model.dto.TeamDTO;
//
//import java.sql.Connection;
//import java.util.List;
//
//import static com.mvc.common.jdbc.JDBCTemplate.*;
//
//public class MemberService {
//
//    private final TeamDAO memberDAO;
//    public MemberService() {
//        memberDAO = new TeamDAO();
//    }
//
//    public TeamDTO selectOneMemberById(String memberCode) {
//
//        /* Connection 생성 */
//        Connection con = getConnection();
//
//       /* Connection과 함께 정보를 전달하여 조회한다. */
//        TeamDTO selectedMember = memberDAO.selectMemberById(con, memberCode);
//
//        /* connection 닫기 */
//       close(con);
//
//       /* 조회 결과를 반환한다. */
//        return selectedMember;
//    }
//
//    /* 직원 정보 전체 조회용 메소드 */
//    public List<TeamDTO> selectAllMember() {
//
//        /* Connection 생성 */
//        Connection con = getConnection();
//
//        /* 비지니스 로직 */
//        /* 1. dao 호출하여 조회 */
//        List<TeamDTO> allMemberList = memberDAO.selectAllMemberList(con);
//
//        /* Connection 닫기 */
//        close(con);
//
//        /* 수행 결과 반환 */
//        return allMemberList;
//    }
//
//    public String selectNewMemberCode() {
//
//        /* Connection 생성 */
//        Connection con = getConnection();
//
//        /* 비지니스 로직 */
//        /* 1. dao 호출하여 조회 */
//        String newMemberCode = memberDAO.selectNewMemberCode(con);
//
//        /* Connection 닫기 */
//        close(con);
//
//        /* 수행 결과 반환 */
//        return newMemberCode;
//    }
//
//    /* 신규 사원 등록용 메소드 */
//    public int insertMember(TeamDTO member) {
//
//        Connection con = getConnection();
//
//        int result = memberDAO.insertMember(con, member);
//
//        if (result > 0) {
//            commit(con);
//        } else {
//            rollback(con);
//        }
//
//        close(con);
//
//        return result;
//    }
//
//    public int updateMember(TeamDTO member) {
//
//        Connection con = getConnection();
//
//        int result = memberDAO.updateMember(con, member);
//
//        if (result > 0) {
//            commit(con);
//        } else {
//            rollback(con);
//        }
//
//        close(con);
//
//        return result;
//    }
//
//    public int deleteMember(String memberCode) {
//
//        Connection con = getConnection();
//
//        int result = memberDAO.deleteMember(con, memberCode);
//
//        if (result > 0) {
//            commit(con);
//        } else {
//            rollback(con);
//        }
//
//        close(con);
//
//        return result;
//    }
//
//}
//
//
//
