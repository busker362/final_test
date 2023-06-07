package com.mvc.controller;

import com.mvc.member.model.dto.MemberDTO;
import com.mvc.member.model.service.MemberService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/member/insert")
public class InsertMemberServlet extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        request.setCharacterEncoding("UTF-8");

        String memberName = request.getParameter("memberName");
        String memberAge = request.getParameter("memberAge");
        String backNumber = request.getParameter("backNumber");
        String position = request.getParameter("position");
        String height = request.getParameter("height");
        String weight = request.getParameter("weight");
        String teamCode = request.getParameter("teamCode");

        MemberService memberService = new MemberService();
        String memberCode = memberService.selectNewMemberCode();

        MemberDTO member = new MemberDTO();
        if (memberCode != null) member.setMemberCode(memberCode);
        member.setMemberName(memberName);
        member.setMemberAge(memberAge);
        member.setBackNumber(backNumber);
        member.setPosition(position);
        member.setHeight(height);
        member.setWeight(weight);
        member.setTeamCode(teamCode);

        System.out.println("insert request member: " + member);

        int result = memberService.insertMember(member);

        String path = "";
        if (result > 0) {
            path = "/WEB-INF/views/common/successPage.jsp";
            request.setAttribute("message", "신규 선수 등록에 성공하셨습니다.");
            request.setAttribute("successCode", "insertMember");
        } else {
            path = "/WEB-INF/views/common/errorPage.jsp";
            request.setAttribute("message", "신규 선수 등록에 실패하셨습니다.");
        }

        request.getRequestDispatcher(path).forward(request, response);
    }
}
