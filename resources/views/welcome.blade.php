<!DOCTYPE html>
<html lang="{{ str_replace('_', '-', app()->getLocale()) }}">
    <head>
        <meta charset="utf-8">
        <meta name="viewport" content="width=device-width, initial-scale=1">

        <title>Anys's Hospital</title>

        <link rel="stylesheet" href="css/style.css">
        <link rel="stylesheet" type="text/css" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.15.1/css/all.min.css">

        <!-- Fonts -->
        <link href="https://fonts.googleapis.com/css2?family=Nunito:wght@400;600;700&display=swap" rel="stylesheet">

        <!-- Styles -->
        <style>
            /*! normalize.css v8.0.1 | MIT License | github.com/necolas/normalize.css */html{line-height:1.15;-webkit-text-size-adjust:100%}body{margin:0}a{background-color:transparent}[hidden]{display:none}html{font-family:system-ui,-apple-system,BlinkMacSystemFont,Segoe UI,Roboto,Helvetica Neue,Arial,Noto Sans,sans-serif,Apple Color Emoji,Segoe UI Emoji,Segoe UI Symbol,Noto Color Emoji;line-height:1.5}*,:after,:before{box-sizing:border-box;border:0 solid #e2e8f0}a{color:inherit;text-decoration:inherit}svg,video{display:block;vertical-align:middle}video{max-width:100%;height:auto}.bg-white{--bg-opacity:1;background-color:#fff;background-color:rgba(255,255,255,var(--bg-opacity))}.bg-gray-100{--bg-opacity:1;background-color:#f7fafc;background-color:rgba(247,250,252,var(--bg-opacity))}.border-gray-200{--border-opacity:1;border-color:#edf2f7;border-color:rgba(237,242,247,var(--border-opacity))}.border-t{border-top-width:1px}.flex{display:flex}.grid{display:grid}.hidden{display:none}.items-center{align-items:center}.justify-center{justify-content:center}.font-semibold{font-weight:600}.h-5{height:1.25rem}.h-8{height:2rem}.h-16{height:4rem}.text-sm{font-size:.875rem}.text-lg{font-size:1.125rem}.leading-7{line-height:1.75rem}.mx-auto{margin-left:auto;margin-right:auto}.ml-1{margin-left:.25rem}.mt-2{margin-top:.5rem}.mr-2{margin-right:.5rem}.ml-2{margin-left:.5rem}.mt-4{margin-top:1rem}.ml-4{margin-left:1rem}.mt-8{margin-top:2rem}.ml-12{margin-left:3rem}.-mt-px{margin-top:-1px}.max-w-6xl{max-width:72rem}.min-h-screen{min-height:100vh}.overflow-hidden{overflow:hidden}.p-6{padding:1.5rem}.py-4{padding-top:1rem;padding-bottom:1rem}.px-6{padding-left:1.5rem;padding-right:1.5rem}.pt-8{padding-top:2rem}.fixed{position:fixed}.relative{position:relative}.top-0{top:0}.right-0{right:0}.shadow{box-shadow:0 1px 3px 0 rgba(0,0,0,.1),0 1px 2px 0 rgba(0,0,0,.06)}.text-center{text-align:center}.text-gray-200{--text-opacity:1;color:#edf2f7;color:rgba(237,242,247,var(--text-opacity))}.text-gray-300{--text-opacity:1;color:#e2e8f0;color:rgba(226,232,240,var(--text-opacity))}.text-gray-400{--text-opacity:1;color:#cbd5e0;color:rgba(203,213,224,var(--text-opacity))}.text-gray-500{--text-opacity:1;color:#a0aec0;color:rgba(160,174,192,var(--text-opacity))}.text-gray-600{--text-opacity:1;color:#718096;color:rgba(113,128,150,var(--text-opacity))}.text-gray-700{--text-opacity:1;color:#4a5568;color:rgba(74,85,104,var(--text-opacity))}.text-gray-900{--text-opacity:1;color:#1a202c;color:rgba(26,32,44,var(--text-opacity))}.underline{text-decoration:underline}.antialiased{-webkit-font-smoothing:antialiased;-moz-osx-font-smoothing:grayscale}.w-5{width:1.25rem}.w-8{width:2rem}.w-auto{width:auto}.grid-cols-1{grid-template-columns:repeat(1,minmax(0,1fr))}@media (min-width:640px){.sm\:rounded-lg{border-radius:.5rem}.sm\:block{display:block}.sm\:items-center{align-items:center}.sm\:justify-start{justify-content:flex-start}.sm\:justify-between{justify-content:space-between}.sm\:h-20{height:5rem}.sm\:ml-0{margin-left:0}.sm\:px-6{padding-left:1.5rem;padding-right:1.5rem}.sm\:pt-0{padding-top:0}.sm\:text-left{text-align:left}.sm\:text-right{text-align:right}}@media (min-width:768px){.md\:border-t-0{border-top-width:0}.md\:border-l{border-left-width:1px}.md\:grid-cols-2{grid-template-columns:repeat(2,minmax(0,1fr))}}@media (min-width:1024px){.lg\:px-8{padding-left:2rem;padding-right:2rem}}@media (prefers-color-scheme:dark){.dark\:bg-gray-800{--bg-opacity:1;background-color:#2d3748;background-color:rgba(45,55,72,var(--bg-opacity))}.dark\:bg-gray-900{--bg-opacity:1;background-color:#1a202c;background-color:rgba(26,32,44,var(--bg-opacity))}.dark\:border-gray-700{--border-opacity:1;border-color:#4a5568;border-color:rgba(74,85,104,var(--border-opacity))}.dark\:text-white{--text-opacity:1;color:#fff;color:rgba(255,255,255,var(--text-opacity))}.dark\:text-gray-400{--text-opacity:1;color:#cbd5e0;color:rgba(203,213,224,var(--text-opacity))}.dark\:text-gray-500{--tw-text-opacity:1;color:#6b7280;color:rgba(107,114,128,var(--tw-text-opacity))}}
        </style>

        <style>
            body {
                font-family: 'Nunito', sans-serif;
            }
            @import url('https://fonts.googleapis.com/css2?family=Poppins:wght@300;400;500;600;700&display=swap');
        
            /* footer css */
            footer*{
                margin:0;
                padding:0;
                box-sizing: border-box;
            }
            .container{
                max-width: 1170px;
                margin:auto;
            }
            .row{
                display: flex;
                flex-wrap: wrap;
            }
            ul{
                list-style: none;
            }
            .footer{
                background-color: #24262b;
                padding-top: 25px ;
            }
            .footer-col{
                width: 33%;
                /* padding: 0 100px;  universal padding but didn't use cz needed individual varibale padding */
            }
            .footer-col h4{
                font-size: 18px;
                color: #ffffff;
                text-transform: capitalize;
                margin-bottom: 35px;
                font-weight: 500;
                position: relative;
            }
            .footer-col h4::before{
                content: '';
                position: absolute;
                left:0;
                bottom: -10px;
                background-color: #e91e63;
                height: 2px;
                box-sizing: border-box;
                width: 50px;
            }
            .footer-col ul li:not(:last-child){
                margin-bottom: 10px;
            }
            .footer-col ul li a{
                font-size: 16px;
                text-transform: capitalize;
                color: #ffffff;
                text-decoration: none;
                font-weight: 300;
                color: #bbbbbb;
                display: block;
                transition: all 0.3s ease;
            }
            .footer-col ul li a:hover{
                color: #ffffff;
                padding-left: 8px;
            }
            .footer-col .social-links a{
                display: inline-block;
                height: 40px;
                width: 40px;
                background-color: rgba(255,255,255,0.2);
                margin:0 10px 10px 0;
                text-align: center;
                line-height: 40px;
                border-radius: 50%;
                color: #ffffff;
                transition: all 0.5s ease;
            }
            .footer-col .social-links a:hover{
                color: #24262b;
                background-color: #ffffff;
            }

            /*responsive*/
            @media(max-width: 767px){
            .footer-col{
                width: 50%;
                margin-bottom: 30px;
            }
            }
            @media(max-width: 574px){
            .footer-col{
                width: 100%;
            }
            }
            /*flex-wrapper is used so that can have at least some empty body aka distance between nav bar and footer if there is no data or less data.
            Need to write the code of both head and footed (basically the two items betwenn whom the distance is needed to created) 
            within the div which had this flex-wrapped implemented*/
            .flex-wrapper { 
                display: flex;
                min-height: 120vh;
                flex-direction: column;
                justify-content: space-between;
            }
        </style>
    </head>
    <body class="antialiased" style="background-color:#f5f5f5">
        <div class="relative flex items-top justify-center min-h-screen  sm:items-center py-4 sm:pt-0" > <!--style="padding: 0px 5px"-->
            <nav class="fixed top=0 right=0 px-6 py-4 sm:block" style="display: flex;flex-direction: row; position: fixed;top: 0; left: 0; width: 100%; height: 55px;padding-left:180px; background-color: white; color: black;box-shadow: rgba(149, 157, 165, 0.2) 0px 8px 24px;"> <!--removed this line = ; z-index: 9999 -->
            
                <a class="navbar-brand" style="padding-bottom:5px" href="{{ url('/') }}">
                   <font size="+1" >Anya's Hospital</font> 
                </a>
                <div>    
                    <li style="list-style: none; float: left; padding-left: 40px"> <!--list-syle=none cz to remove the dot which appears before the menu name -->
                        <a id="navbarDropdown" class="nav-link" href="{{ url('/')}}" role="button" aria-haspopup="true" aria-expanded="false" v-pre>
                        {{"Home"}}
                        </a>
                    </li>
                </div>
                <div>    
                    <li style="list-style: none; float: left; padding-left: 40px"> <!--list-syle=none cz to remove the dot which appears before the menu name -->
                    <a id="navbarDropdown" class="nav-link" href="{{ url('/aboutUs') }}" role="button" aria-haspopup="true" aria-expanded="false" v-pre>
                        {{"About Us"}}
                        </a>
                    </li>
                </div>
                <div>    
                    <li style="list-style: none; float: left; padding-left: 40px"> <!--list-syle=none cz to remove the dot which appears before the menu name -->
                        <a id="navbarDropdown" class="nav-link" href="{{ url('/doctors') }}" role="button" aria-haspopup="true" aria-expanded="false" v-pre>
                        {{"Doctors"}}
                        </a>
                    </li>
                </div>
                <div>    
                    <li style="list-style: none; float: left; padding-left: 40px"> <!--list-syle=none cz to remove the dot which appears before the menu name -->
                        <a id="navbarDropdown" class="nav-link" href="{{ url('/contact') }}" role="button" aria-haspopup="true" aria-expanded="false" v-pre>
                        {{"Contacts"}}
                        </a>
                    </li>
                </div>
                
            
            @if (Route::has('login'))
                <div class="hidden fixed top-0 right-0 px-6 py-4 sm:block" style="padding-right:120px">
                    @auth
                        <a href="{{ url('/home') }}" class="text-sm text-white-700 dark:text-white-500">Dashboard</a>
                    @else
                        <a href="{{ route('login') }}" class="text-sm text-white-700 dark:text-white-500">Log in</a>

                        @if (Route::has('register'))
                            <a href="{{ route('register') }}" class="ml-4 text-sm text-white-700 dark:text-white-500">Register</a>
                        @endif
                    @endauth
                </div>
            @endif
            </nav>

            
            <div class = "flex justify-center pt-0 sm:justify-start sm:pt-0" style="display: flex; flex-direction: column;">
                <img src="{{URL('/images/logo-center new.jpg')}}" style = "width: 180px; height: 180px;" >
                    <div  style="display: flex; flex-direction: row;box-shadow: rgba(136, 165, 191, 0.48) 6px 2px 16px 0px, rgba(255, 255, 255, 0.8) -6px -2px 16px 0px;background-color:white">
                        <div style="padding-top: 70px; box-sizing: border-box">
                            <pre><i><h1 style="margin: 0px">"Serving one's patients,</h1></i></pre>
                            <pre><i><h1 style="margin: 0px">            is one's existence"</h1></i></pre>
                        </div>
                        <div>
                            <img src="{{URL('/images/president.jpg')}}" style = "width: 250px; height: 250px;" >
                        </div>
                    </div>
            </div>
            
            
        </div>
<!-- --------------------------------------------------------------------------------------------------------------------- -->
        
<!-- -------------------------------------------------------------------------------------------------------------------------------->
        <!-- footer portion of code -->
        <footer class="footer">
            <div class="container">
                <div class="row">
                    <div class="footer-col" style="padding-left: 50px">
                        <h4>Hospital</h4>
                        <ul>
                            <li><a href="#">about us</a></li>
                            <li><a href="#">our services</a></li>
                            <li><a href="#">privacy policy</a></li>
                            <li><a href="#">affiliate program</a></li>
                        </ul>
                    </div>
                    <div class="footer-col" style="padding-left: 130px">
                        <h4>get help</h4>
                        <ul>
                            <li><a href="#">FAQ</a></li>
                            <li><a href="{{ url('/pharmacy/showMediList',$sortBy='Default') }}">Pharmacy</a></li>
                            <li><a href="{{ url('/showAppointmentList',$filterBy='All') }}">Appointments</a></li>
                            <li><a href="{{ url('/receptionist/showRoomList',$sortBy='Default') }}">Hospital Room Booking</a></li>
                        </ul>
                    </div>

                    <div class="footer-col" style="padding-left: 140px">
                        <h4>follow us</h4>
                        <div class="social-links">
                            <a href="https://www.facebook.com" target="_blank"><i class="fab fa-facebook-f"></i></a>
                            <a href="https://www.twitter.com" target="_blank"><i class="fab fa-twitter"></i></a>
                            <a href="https://www.instagram.com" target="_blank"><i class="fab fa-instagram"></i></a>
                            <a href="https://www.linkedein.com" target="_blank"><i class="fab fa-linkedin-in"></i></a>
                        </div>
                    </div>
                </div>
            </div>
        </footer>
    </body>
</html>
