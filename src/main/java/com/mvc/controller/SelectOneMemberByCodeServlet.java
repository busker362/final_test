package com.mvc.controller;

import com.mvc.member.model.dto.MemberDTO;
import com.mvc.member.model.service.MemberService;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet("/selectOneMemberByCode")
public class SelectOneMemberByCodeServlet extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String memberByCode = request.getParameter("memberCode");
        System.out.println("memberCode : " + memberByCode);
        MemberService memberService = new MemberService();
        MemberDTO selectedMember = memberService.selectOneMemberByCode(memberByCode);
        System.out.println(selectedMember);

        String path = "";
        if(selectedMember != null) {
            path = "/WEB-INF/views/member/member.jsp";
            request.setAttribute("selectedMember", selectedMember);
        } else {
            path = "/WEB-INF/views/common/errorPage.jsp";
            request.setAttribute("message", "선수 정보 조회 실패!");
        }

        RequestDispatcher dispatcher = request.getRequestDispatcher(path);
        dispatcher.forward(request, response);
    }

}
