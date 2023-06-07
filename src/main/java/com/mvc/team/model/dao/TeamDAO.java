package com.mvc.team.model.dao;//package com.mvc.team.model.dao;
//
//import com.mvc.common.config.ConfigLocation;
//import com.mvc.team.model.dto.TeamDTO;
//
//import java.io.FileInputStream;
//import java.io.IOException;
//import java.sql.*;
//import java.util.ArrayList;
//import java.util.List;
//import java.util.Properties;
//
//import static com.mvc.common.jdbc.JDBCTemplate.close;
//
//public class TeamDAO {
//
//    private final Properties prop;
//
//    public TeamDAO() {
//
//        prop = new Properties();
//
//        try {
//            prop.loadFromXML(new FileInputStream(ConfigLocation.MAPPER_LOCATION + "member-mapper.xml"));
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//    }
//
//
//    public TeamDTO selectTeamCode(Connection con, String teamCode) {
//
//        PreparedStatement pstmt = null;
//        ResultSet rset = null;
//
//        TeamDTO selectedTeam = null;
//
//        String query = prop.getProperty("selectTeamCode");
//
//        try {
//            pstmt = con.prepareStatement(query);
//            pstmt.setString(1, teamCode);
//
//            rset = pstmt.executeQuery();
//
//            if (rset.next()) {
//                selectedTeam = new TeamDTO();
//                selectedTeam.setTeamCode(rset.getString("TEAM_CODE"));
//                selectedTeam.setTeamName(rset.getString("TEAM_NAME"));
//                selectedTeam.setRegion(rset.getString("REGION"));
//            }
//
//        } catch (SQLException e) {
//            e.printStackTrace();
//        } finally {
//            close(rset);
//            close(pstmt);
//        }
//
//        return selectedTeam;
//    }
//
//
//
//
//    /* employee 테이블의 전체 목록 조회 */
//    public List<TeamDTO> selectAllTeamList(Connection con) {
//
//        Statement stmt = null;
//        ResultSet rset = null;
//
//        List<TeamDTO> teamList = null;
//
//        String query = prop.getProperty("selectAllTeamList");
//
//        try {
//            stmt = con.createStatement();
//            rset = stmt.executeQuery(query);
//
//            teamList = new ArrayList<>();
//
//            while (rset.next()) {
//                TeamDTO team = new TeamDTO();
//                team.setTeamCode(rset.getString("TEAM_CODE"));
//                team.setTeamName(rset.getString("TEAM_NAME"));
//                team.setRegion(rset.getString("REGION"));
//
//                teamList.add(team);
//            }
//
//        } catch (SQLException e) {
//            e.printStackTrace();
//        } finally {
//            close(rset);
//            close(stmt);
//        }
//
//        return teamList;
//    }
//
//    public String selectNewMemberCode(Connection con) {
//        PreparedStatement pstmt = null;
//        ResultSet rset = null;
//
//        String newMemberCode = null;
//
//        String query = prop.getProperty("selectNewMemberId");
//
//        try {
//            pstmt = con.prepareStatement(query);
//
//            rset = pstmt.executeQuery();
//
//            if (rset.next()) {
//                newMemberCode = rset.getString("MEMBER_CODE");
//            }
//
//        } catch (SQLException e) {
//            e.printStackTrace();
//        } finally {
//            close(rset);
//            close(pstmt);
//        }
//
//        return newMemberCode;
//    }
//
//    /* employee 테이블에 insert 하는 메소드 */
//    public int insertMember(Connection con, TeamDTO member) {
//
//        PreparedStatement pstmt = null;
//
//        int result = 0;
//
//        String query = prop.getProperty("insertMember");
//
//        try {
//            pstmt = con.prepareStatement(query);
//            pstmt.setString(1, member.getMemberCode());
//            pstmt.setString(2, member.getMemberName());
//            pstmt.setString(3, member.getMemberAge());
//            pstmt.setString(4, member.getBackNumber());
//            pstmt.setString(5, member.getPosition());
//            pstmt.setString(6, member.getHeight());
//            pstmt.setString(7, member.getWeight());
//            pstmt.setString(8, member.getTeamCode());
//
//            result = pstmt.executeUpdate();
//
//        } catch (SQLException e) {
//            e.printStackTrace();
//        } finally {
//            close(pstmt);
//        }
//
//        return result;
//    }
//
//
//    public int updateMember(Connection con, TeamDTO member) {
//
//        PreparedStatement pstmt = null;
//
//        int result = 0;
//
//        String query = prop.getProperty("updateMember");
//
//        try {
//            pstmt = con.prepareStatement(query);
//            pstmt.setString(1, member.getMemberAge());
//            pstmt.setString(2, member.getHeight());
//            pstmt.setString(3, member.getWeight());
//            pstmt.setString(4, member.getMemberCode());
//
//            result = pstmt.executeUpdate();
//
//        } catch (SQLException e) {
//            e.printStackTrace();
//        } finally {
//            close(pstmt);
//        }
//
//        return result;
//    }
//
//
//    public int deleteMember(Connection con, String memberCode) {
//
//        PreparedStatement pstmt = null;
//
//        int result = 0;
//
//        String query = prop.getProperty("deleteMember");
//
//        try {
//            pstmt = con.prepareStatement(query);
//            pstmt.setString(1, memberCode);
//
//            result = pstmt.executeUpdate();
//
//        } catch (SQLException e) {
//            e.printStackTrace();
//        } finally {
//            close(pstmt);
//        }
//
//        return result;
//    }
//
//}