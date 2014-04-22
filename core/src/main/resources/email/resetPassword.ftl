<!DOCTYPE html>
<html xmlns='http://www.w3.org/1999/xhtml'>
<head>
    <meta content='text/html; charset=utf-8' http-equiv='Content-Type'>
    <meta content='width=device-width, initial-scale=1.0' name='viewport'>
    <title>Your Message Subject or Title</title>
    <style>
        /*<![CDATA[*/
        #outlook a {padding:0;} /* Force Outlook to provide a "view in browser" menu link. */
        body{width:100% !important; -webkit-text-size-adjust:100%; -ms-text-size-adjust:100%; margin:0; padding:0;}
        .ExternalClass {width:100%;} /* Force Hotmail to display emails at full width */
        .ExternalClass, .ExternalClass p, .ExternalClass span, .ExternalClass font, .ExternalClass td, .ExternalClass div {line-height: 100%;} /* Force Hotmail to display normal line spacing.  More on that: http://www.emailonacid.com/forum/viewthread/43/ */
        #backgroundTable {margin:0; padding:0; width:100% !important; line-height: 100% !important;}
        img {outline:none; text-decoration:none; -ms-interpolation-mode: bicubic;}
        a img {border:none;}
        .image_fix {display:block;}
        Bring inline: Yes.
        p {margin: 1em 0;}
        h1, h2, h3, h4, h5, h6 {color: black !important;}
        h1 a, h2 a, h3 a, h4 a, h5 a, h6 a {color: blue !important;}
        h1 a:active, h2 a:active,  h3 a:active, h4 a:active, h5 a:active, h6 a:active {
            color: red !important; /* Preferably not the same color as the normal header link color.  There is limited support for psuedo classes in email clients, this was added just for good measure. */
        }
        h1 a:visited, h2 a:visited,  h3 a:visited, h4 a:visited, h5 a:visited, h6 a:visited {
            color: purple !important; /* Preferably not the same color as the normal header link color. There is limited support for psuedo classes in email clients, this was added just for good measure. */
        }
        table td {border-collapse: collapse;}
        table { border-collapse:collapse; mso-table-lspace:0pt; mso-table-rspace:0pt; }
        a {color: orange;}
        a:link { color: orange; }
        a:visited { color: blue; }
        a:hover { color: green; }
        /*]]>*/
    </style>
</head>
<body style='background: #f4f7f9; font-family:Helvetica Neue, Helvetica, Arial;'>
<table align='center' bgcolor='#f4f7f9' border='0' cellpadding='0' cellspacing='0' id='backgroundTable' style='background: #f4f7f9;' width='100%'>
    <tr>
        <td align='center'>
            <center>
                <table border='0' cellpadding='50' cellspacing='0' style='margin-left: auto;margin-right: auto;width:600px;text-align:center;' width='600'>
                    <tr>
                        <td align='center' valign='top'>
                            <img src="http://www.groupnotifier.com/assets/images/emails/logo.png"
                                 style="outline:none; text-decoration:none;border:none,display:block;"/>
                        </td>
                    </tr>
                </table>
            </center>
        </td>
    </tr>
    <tr>
        <td align='center'>
            <center>
                <table border='0' cellpadding='30' cellspacing='0' style='margin-left: auto;margin-right: auto;width:600px;text-align:center;' width='600'>
                    <tr>
                        <td align='left' style='background: #ffffff; border: 1px solid #dce1e5;' valign='top' width=''>
                            <table border='0' cellpadding='0' cellspacing='0' width='100%'>
                                <tr>
                                    <td align='center' valign='top'>
                                        <h2 style='color: #f34541 !important'>Password reset</h2>
                                    </td>
                                </tr>
                                <tr>
                                    <td align='center' style='border-top: 1px solid #dce1e5;border-bottom: 1px solid #dce1e5;' valign='top'>
                                        <p style='margin: 1em 0;'>
                                            <strong>Username:</strong>
                                            ${user.username}
                                        </p>
                                        <p style='margin: 1em 0;'>
                                            <strong>E-mail:</strong>
                                            <span>${user.email}</span>
                                        </p>
                                    </td>
                                </tr>
                                <tr>
                                    <td align='center' bgcolor='#f34541' valign='top'>
                                        <h3><a href="http://www.groupnotifier.com/ChangePassword?code=${user.verificationRecord}&id=${user.id}" style="color: #ffffff !important">Change my password</a></h3>
                                    </td>
                                </tr>
                            </table>
                        </td>
                    </tr>
                </table>
            </center>
        </td>
    </tr>
    <tr>
        <td align='center'>
            <center>
                <table border='0' cellpadding='30' cellspacing='0'
                       style='margin-left: auto;margin-right: auto;width:600px;text-align:center;' width='600'>
                    <tr>
                        <td align='left' style='background: #ffffff; border: 1px solid #dce1e5;' valign='top'>
                        <span style="font-size:12px;">
                        You are getting these messages either because you requested it, or you are part of a group that is sending messages.<br/>
                        You can unsubscribe to these emails by changing your notification settings.<br/>
                        Winito, Inc. 147 W 35th Street, Suite 1204, New York, NY 10001</span>
                        </td>
                    </tr>
                </table>
            </center>
        </td>
    </tr>
</table>
</body>
</html>
