package com.mvc.controller;

import com.mvc.member.model.dto.MemberDTO;
import com.mvc.member.model.service.MemberService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/member/update")
public class UpdateEmpServlet extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        request.setCharacterEncoding("UTF-8");

        String memberCode = request.getParameter("memberCode");
        String memberAge = request.getParameter("memberAge");
        String height = request.getParameter("height");
        String weight = request.getParameter("weight");

        MemberDTO member = new MemberDTO();
        member.setMemberCode(memberCode);
        member.setMemberAge(memberAge);
        member.setHeight(height);
        member.setWeight(weight);


        int result = new MemberService().updateMember(member);

        String path = "";
        if(result > 0) {
            path = "/WEB-INF/views/common/successPage.jsp";
            request.setAttribute("successCode", "updateMember");
        } else {
            path = "/WEB-INF/views/common/errorPage.jsp";
            request.setAttribute("message", "선수 정보 수정 실패!");
        }

        request.getRequestDispatcher(path).forward(request, response);
    }

}
