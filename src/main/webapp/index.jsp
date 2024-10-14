<%@page contentType="text/html" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html lang="es">

    <%@include file="assets/components/HeaderComponent.jsp"%>
    
<body id="page-top">
    
    <!-- Page Wrapper -->
    <div id="wrapper">
        
    <%@include file="assets/components/SideBarComponent.jsp"%>
            
        <!-- Content Wrapper -->
        <div id="content-wrapper" class="d-flex flex-column">
    
            <!-- Main Content -->
            <div id="content">
                    
            <%@include file="assets/components/TopBarComponent.jsp"%>
                
            <!-- Begin Page Content -->
                <div class="container-fluid"> <!-- AQUI SE DESARROLLARA EL CONTENIDO DE CADA PAGINA -->
                    
                    <h1>Hola bb</h1>
                    
                </div>
                <!-- /.container-fluid -->

            </div>
            <!-- End of Main Content -->
            
        <%@include file="assets/components/FooterComponent.jsp"%>
        
        </div>
        <!-- End of Content Wrapper -->
    
    </div>
    <!-- End of Page Wrapper --> 
        
        <!-- Scroll to Top Button-->
    <a class="scroll-to-top rounded" href="#page-top">
        <i class="fas fa-angle-up"></i>
    </a>
  
    <%@include file="assets/components/ScriptsComponent.jsp"%>

</body>

</html>