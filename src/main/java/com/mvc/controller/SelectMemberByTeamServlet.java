package com.mvc.controller;

import com.mvc.member.model.dto.MemberDTO;
import com.mvc.member.model.service.MemberService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet("/member/selectteam")
public class SelectMemberByTeamServlet extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String team = request.getParameter("team");
        System.out.println("team: " + team);
        MemberService memberService = new MemberService();
        List<MemberDTO> membersByTeam = memberService.selectMembersByPosition(team);

        for(MemberDTO member : membersByTeam) {
            System.out.println(member);
        }

        String path = "";
        if (!membersByTeam.isEmpty()) {
            path = "/WEB-INF/views/member/memberList.jsp";
            request.setAttribute("memberList", membersByTeam);
        } else {
            path = "/WEB-INF/views/common/errorPage.jsp";
            request.setAttribute("message", "선수 정보 조회 실패!");
        }

        request.getRequestDispatcher(path).forward(request, response);
    }
}
