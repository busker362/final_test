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

@WebServlet("/member/list")
public class SelectAllMemberServlet extends HttpServlet {


    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        MemberService memberService = new MemberService();
        List<MemberDTO> memberList = memberService.selectAllMemberList();

        for(MemberDTO member : memberList) {
            System.out.println(member);
        }

        String path = "";
        if(memberList != null && memberList.size() > 0) {
            path = "/WEB-INF/views/member/memberList.jsp";
            request.setAttribute("memberList", memberList);
        } else {
            path = "/WEB-INF/views/common/errorPage.jsp";
            request.setAttribute("message", "선수 목록 조회 실패!");
        }
        request.getRequestDispatcher(path).forward(request, response);
    }
}