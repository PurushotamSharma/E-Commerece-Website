<%@page import="java.util.Calendar"%>
<%@page import="java.text.SimpleDateFormat"%>
<%@page import="java.time.LocalDateTime"%>
<%@page import="java.time.format.DateTimeFormatter"%>
<%@page import="project.ConnectionProvider"%>
<%@page import="java.sql.*"%>
<%
    String email = session.getAttribute("email").toString();
    String address = request.getParameter("address");
    String city = request.getParameter("city");
    String state = request.getParameter("state");
    String country = request.getParameter("country");
    String mobileNumber = request.getParameter("mobileNumber");
    String paymentMethod = request.getParameter("paymentMethod");
    String transactionId = "";
    transactionId = request.getParameter("transactionId");
    String status = "bill";

    try {
        Connection con = ConnectionProvider.getCon();
        PreparedStatement ps = con.prepareStatement("update users set address=?,city=?,state=?,country=?,mobileNumber=? where email=?");
        ps.setString(1, address);
        ps.setString(2, city);
        ps.setString(3, state);
        ps.setString(4, country);
        ps.setString(5, mobileNumber);
        ps.setString(6, email);
        ps.executeUpdate();
        
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
        LocalDateTime now = LocalDateTime.now();  
        
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");   
        Calendar cal = Calendar.getInstance(); 
        
        cal.add(Calendar.DAY_OF_MONTH, 7);  
        String dateAfter = sdf.format(cal.getTime());  

        PreparedStatement ps1 = con.prepareStatement("update cart set address=?,city=?,state=?,country=?,mobileNumber=?,orderDate='"+dtf.format(now)+"',deliveryDate='"+dateAfter+"',paymentMethod=?,transactionId=?,status=? where email=? and address is NULL");
        ps1.setString(1, address);
        ps1.setString(2, city);
        ps1.setString(3, state);
        ps1.setString(4, country);
        ps1.setString(5, mobileNumber);
        ps1.setString(6, paymentMethod);
        ps1.setString(7, transactionId);
        ps1.setString(8, status);
        ps1.setString(9, email);
        int a = ps1.executeUpdate();
        response.sendRedirect("bill.jsp");
    } catch (Exception e) {
        System.out.println(e);
    }
%>