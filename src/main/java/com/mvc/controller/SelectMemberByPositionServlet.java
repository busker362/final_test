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

@WebServlet("/member/selectposition")
public class SelectMemberByPositionServlet extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String position = request.getParameter("position");
        System.out.println("position: " + position);
        MemberService memberService = new MemberService();
        List<MemberDTO> membersByPosition = memberService.selectMembersByPosition(position);

        for(MemberDTO member : membersByPosition) {
            System.out.println(member);
        }

        String path = "";
        if (!membersByPosition.isEmpty()) {
            path = "/WEB-INF/views/member/memberList.jsp";
            request.setAttribute("memberList", membersByPosition);
        } else {
            path = "/WEB-INF/views/common/errorPage.jsp";
            request.setAttribute("message", "선수 정보 조회 실패!");
        }

        request.getRequestDispatcher(path).forward(request, response);
    }
}
