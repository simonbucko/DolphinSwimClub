import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class HtmlTemplate {
    public static String getTemplate(String name, String surname, LocalDate date){
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("d/MM/yyyy");
        return("<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Transitional//EN\" \"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd\">\n" +
                "<html xmlns=\"http://www.w3.org/1999/xhtml\" xmlns:v=\"urn:schemas-microsoft-com:vml\" xmlns:o=\"urn:schemas-microsoft-com:office:office\">\n" +
                "<head>\n" +
                "\t<!--[if gte mso 9]>\n" +
                "\t<xml>\n" +
                "\t\t<o:OfficeDocumentSettings>\n" +
                "\t\t<o:AllowPNG/>\n" +
                "\t\t<o:PixelsPerInch>96</o:PixelsPerInch>\n" +
                "\t\t</o:OfficeDocumentSettings>\n" +
                "\t</xml>\n" +
                "\t<![endif]-->\n" +
                "\t<meta http-equiv=\"Content-type\" content=\"text/html; charset=utf-8\" />\n" +
                "\t<meta name=\"viewport\" content=\"width=device-width, initial-scale=1, maximum-scale=1\" />\n" +
                "    <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\" />\n" +
                "\t<meta name=\"format-detection\" content=\"date=no\" />\n" +
                "\t<meta name=\"format-detection\" content=\"address=no\" />\n" +
                "\t<meta name=\"format-detection\" content=\"telephone=no\" />\n" +
                "\t<meta name=\"x-apple-disable-message-reformatting\" />\n" +
                "    <!--[if !mso]><!-->\n" +
                "\t<link href=\"https://fonts.googleapis.com/css?family=Merriweather:400,400i,700,700i\" rel=\"stylesheet\" />\n" +
                "    <!--<![endif]-->\n" +
                "\t<title>Email Template</title>\n" +
                "\t<!--[if gte mso 9]>\n" +
                "\t<style type=\"text/css\" media=\"all\">\n" +
                "\t\tsup { font-size: 100% !important; }\n" +
                "\t</style>\n" +
                "\t<![endif]-->\n" +
                "\t\n" +
                "\n" +
                "\t<style type=\"text/css\" media=\"screen\">\n" +
                "\t\t/* Linked Styles */\n" +
                "\t\tbody { padding:0 !important; margin:0 !important; display:block !important; min-width:100% !important; width:100% !important; background:#001f51; -webkit-text-size-adjust:none }\n" +
                "\t\ta { color:#000001; text-decoration:none }\n" +
                "\t\tp { padding:0 !important; margin:0 !important } \n" +
                "\t\timg { -ms-interpolation-mode: bicubic; /* Allow smoother rendering of resized image in Internet Explorer */ }\n" +
                "\t\t.mcnPreviewText { display: none !important; }\n" +
                "\n" +
                "\t\t\t\t\n" +
                "\t\t/* Mobile styles */\n" +
                "\t\t@media only screen and (max-device-width: 480px), only screen and (max-width: 480px) {\n" +
                "\t\t\t.mobile-shell { width: 100% !important; min-width: 100% !important; }\n" +
                "\t\t\t.bg { background-size: 100% auto !important; -webkit-background-size: 100% auto !important; }\n" +
                "\t\t\t\n" +
                "\t\t\t.text-header,\n" +
                "\t\t\t.m-center { text-align: center !important; }\n" +
                "\t\t\t\n" +
                "\t\t\t.center { margin: 0 auto !important; }\n" +
                "\t\t\t.container { padding: 20px 10px !important }\n" +
                "\t\t\t\n" +
                "\t\t\t.td { width: 100% !important; min-width: 100% !important; }\n" +
                "\n" +
                "\t\t\t.m-br-15 { height: 15px !important; }\n" +
                "\t\t\t.p30-15 { padding: 30px 15px !important; }\n" +
                "\t\t\t.p0-15-30 { padding: 0px 15px 30px 15px !important; }\n" +
                "\t\t\t.mpb30 { padding-bottom: 30px !important; }\n" +
                "\n" +
                "\t\t\t.m-td,\n" +
                "\t\t\t.m-hide { display: none !important; width: 0 !important; height: 0 !important; font-size: 0 !important; line-height: 0 !important; min-height: 0 !important; }\n" +
                "\n" +
                "\t\t\t.m-block { display: block !important; }\n" +
                "\n" +
                "\t\t\t.fluid-img img { width: 100% !important; max-width: 100% !important; height: auto !important; }\n" +
                "\n" +
                "\t\t\t.column,\n" +
                "\t\t\t.column-dir,\n" +
                "\t\t\t.column-top,\n" +
                "\t\t\t.column-empty,\n" +
                "\t\t\t.column-empty2,\n" +
                "\t\t\t.column-dir-top { float: left !important; width: 100% !important; display: block !important; }\n" +
                "\n" +
                "\t\t\t.column-empty { padding-bottom: 30px !important; }\n" +
                "\t\t\t.column-empty2 { padding-bottom: 10px !important; }\n" +
                "\n" +
                "\t\t\t.content-spacing { width: 15px !important; }\n" +
                "\t\t}\n" +
                "\t</style>\n" +
                "</head>\n" +
                "<body class=\"body\" style=\"padding:0 !important; margin:0 !important; display:block !important; min-width:100% !important; width:100% !important; background:#001f51; -webkit-text-size-adjust:none;\">\n" +
                "\t<table width=\"100%\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\" bgcolor=\"#001f51\">\n" +
                "\t\t<tr>\n" +
                "\t\t\t<td align=\"center\" valign=\"top\">\n" +
                "\t\t\t\t<table width=\"650\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\" class=\"mobile-shell\">\n" +
                "\t\t\t\t\t<tr>\n" +
                "\t\t\t\t\t\t<td class=\"td container\" style=\"width:650px; min-width:650px; font-size:0pt; line-height:0pt; margin:0; font-weight:normal; padding:55px 0px;\">\n" +
                "\t\t\t\t\t\t\t<!-- Header -->\n" +
                "\t\t\t\t\t\t\t\n" +
                "\t\t\t\t\t\t\t<!-- END Header -->\n" +
                "\n" +
                "\t\t\t\t\t\t\t<!-- Hero Image -->\n" +
                "\t\t\t\t\t\t\t<table width=\"100%\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\n" +
                "\t\t\t\t\t\t\t\t<tr>\n" +
                "\t\t\t\t\t\t\t\t\t<td class=\"fluid-img\" style=\"font-size:0pt; line-height:0pt; text-align:left;\"><img src=\"https://github.com/simonbucko/DolphinSwimClub/blob/master/img/DolphinsSwimClubLogo.jpg?raw=true\" border=\"0\" width=\"650\" height=\"366\" alt=\"\" /></td>\n" +
                "\t\t\t\t\t\t\t\t</tr>\n" +
                "\t\t\t\t\t\t\t</table>\n" +
                "\t\t\t\t\t\t\t<!-- END Hero Image -->\n" +
                "\n" +
                "\t\t\t\t\t\t\t<!-- Intro -->\n" +
                "\t\t\t\t\t\t\t<table width=\"100%\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\" bgcolor=\"#ffffff\">\n" +
                "\t\t\t\t\t\t\t\t<tr>\n" +
                "\t\t\t\t\t\t\t\t\t<td style=\"padding-bottom: 10px;\">\n" +
                "\t\t\t\t\t\t\t\t\t\t<table width=\"100%\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\n" +
                "\t\t\t\t\t\t\t\t\t\t\t<tr>\n" +
                "\t\t\t\t\t\t\t\t\t\t\t\t<td class=\"p30-15\" style=\"padding: 60px 30px;\">\n" +
                "\t\t\t\t\t\t\t\t\t\t\t\t\t<table width=\"100%\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\n" +
                "\t\t\t\t\t\t\t\t\t\t\t\t\t\t<tr>\n" +
                "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<td class=\"h1 pb25\" style=\"color:#444444; font-family:'Merriweather', Georgia,serif; font-size:35px; line-height:42px; text-align:center; padding-bottom:25px;\">Dear " +name+ " " +surname+ ",</td>\n" +
                "\t\t\t\t\t\t\t\t\t\t\t\t\t\t</tr>\n" +
                "\t\t\t\t\t\t\t\t\t\t\t\t\t\t<tr>\n" +
                "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<td class=\"text-center pb25\" style=\"color:#666666; font-family:Arial,sans-serif; font-size:16px; line-height:30px; text-align:center; padding-bottom:25px;\"> We are writing to you to kindly inform you, that your current membership with Dolphins Swim Club is about to expire on " + formatter.format(date) + ". Therefore, we would like to offer you one of our memberships.</td>\n" +
                "\t\t\t\t\t\t\t\t\t\t\t\t\t\t</tr>\n" +
                "\t\t\t\t\t\t\t\t\t\t\t\t\t\t<!-- Button -->\n" +
                "\t\t\t\t\t\t\t\t\t\t\t\t\t\t<tr>\n" +
                "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<td align=\"center\">\n" +
                "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<table class=\"center\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\" style=\"text-align:center;\">\n" +
                "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<tr>\n" +
                "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<td class=\"text-button\" style=\"background:#ffda5c; color:#444444; font-family:'Merriweather', Georgia,serif; font-size:14px; line-height:18px; padding:12px 15px; text-align:center; border-radius:10px; text-transform:uppercase;\"><span class=\"link\" style=\"color:#000001; text-decoration:none;\">SCROLL DOWN</span></td>\n" +
                "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t</tr>\n" +
                "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t</table>\n" +
                "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t</td>\n" +
                "\t\t\t\t\t\t\t\t\t\t\t\t\t\t</tr>\n" +
                "\t\t\t\t\t\t\t\t\t\t\t\t\t\t<!-- END Button -->\n" +
                "\t\t\t\t\t\t\t\t\t\t\t\t\t</table>\n" +
                "\t\t\t\t\t\t\t\t\t\t\t\t</td>\n" +
                "\t\t\t\t\t\t\t\t\t\t\t</tr>\n" +
                "\t\t\t\t\t\t\t\t\t\t</table>\n" +
                "\t\t\t\t\t\t\t\t\t</td>\n" +
                "\t\t\t\t\t\t\t\t</tr>\n" +
                "\t\t\t\t\t\t\t</table>\n" +
                "\t\t\t\t\t\t\t<!-- END Intro -->\n" +
                "\n" +
                "\t\t\t\t\t\t\t<!-- Article / Blue Background -->\n" +
                "\t\t\t\t\t\t\t<table width=\"100%\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\n" +
                "\t\t\t\t\t\t\t\t<tr>\n" +
                "\t\t\t\t\t\t\t\t\t<td bgcolor=\"#34a1e6\">\n" +
                "\t\t\t\t\t\t\t\t\t\t<table width=\"100%\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\n" +
                "\t\t\t\t\t\t\t\t\t\t\t<tr>\n" +
                "\t\t\t\t\t\t\t\t\t\t\t\t<th class=\"column-top\" dir=\"ltr\" width=\"217\" style=\"font-size:0pt; line-height:0pt; padding:0; margin:0; font-weight:normal; vertical-align:top;\">\n" +
                "\t\t\t\t\t\t\t\t\t\t\t\t\t<table width=\"100%\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\n" +
                "\t\t\t\t\t\t\t\t\t\t\t\t\t\t<tr>\n" +
                "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<td class=\"fluid-img\" style=\"font-size:0pt; line-height:0pt; text-align:left;\"><img src=\"https://github.com/simonbucko/DolphinSwimClub/blob/master/img/passive_img.jpg?raw=true\" width=\"217\" height=\"440\" border=\"0\" alt=\"\" /></td>\n" +
                "\t\t\t\t\t\t\t\t\t\t\t\t\t\t</tr>\n" +
                "\t\t\t\t\t\t\t\t\t\t\t\t\t</table>\n" +
                "\t\t\t\t\t\t\t\t\t\t\t\t</th>\n" +
                "\t\t\t\t\t\t\t\t\t\t\t\t<th class=\"column\" width=\"50\" style=\"font-size:0pt; line-height:0pt; padding:0; margin:0; font-weight:normal;\"></th>\n" +
                "\t\t\t\t\t\t\t\t\t\t\t\t<th class=\"column\" style=\"font-size:0pt; line-height:0pt; padding:0; margin:0; font-weight:normal;\">\n" +
                "\t\t\t\t\t\t\t\t\t\t\t\t\t<table width=\"100%\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\n" +
                "\t\t\t\t\t\t\t\t\t\t\t\t\t\t<tr>\n" +
                "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<td class=\"p30-15\">\n" +
                "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<table width=\"100%\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\n" +
                "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<tr>\n" +
                "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<td class=\"h3 white pb20\" style=\"font-family:'Merriweather', Georgia,serif; font-size:25px; line-height:32px; text-align:left; color:#ffffff; padding-bottom:20px;\">\n" +
                "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tPassive Membership\n" +
                "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t</td>\n" +
                "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t</tr>\n" +
                "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<tr>\n" +
                "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<td class=\"text white pb20\" style=\"font-family:Arial,sans-serif; font-size:14px; line-height:26px; text-align:left; color:#ffffff; padding-bottom:20px;\">Passive membership is for you, if you do not plan to swim on regular basis. It is also for you, when you consired swimming as free time activity and you just want to have access to our swimming pool</td>\n" +
                "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t</tr>\n" +
                "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<tr>\n" +
                "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<td class=\"pb20\" style=\"padding-bottom:20px;\">\n" +
                "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<table width=\"100%\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\n" +
                "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<tr>\n" +
                "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<td class=\"pb10\" style=\"padding-bottom:10px;\">\n" +
                "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<table width=\"100%\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\n" +
                "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<tr>\n" +
                "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<td valign=\"top\" class=\"img\" width=\"20\" style=\"font-size:0pt; line-height:0pt; text-align:left;\"></td>\n" +
                "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<td valign=\"top\" class=\"img\" width=\"24\" style=\"font-size:0pt; line-height:0pt; text-align:left;\"><img src=\"images/t3_ico_yellow_check.png\" width=\"12\" height=\"15\" border=\"0\" alt=\"\" /></td>\n" +
                "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<td valign=\"top\" class=\"text2 white\" style=\"font-family:'Merriweather', Georgia,serif; font-size:14px; line-height:26px; text-align:left; font-style:italic; color:#ffffff;\">Unlimited access to the swimming pool</td>\n" +
                "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t</tr>\n" +
                "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t</table>\n" +
                "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t</td>\n" +
                "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t</tr>\n" +
                "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t</table>\n" +
                "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t</td>\n" +
                "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t</tr>\n" +
                "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<!-- Button -->\n" +
                "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<tr>\n" +
                "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<td align=\"left\">\n" +
                "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<table border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\n" +
                "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<tr>\n" +
                "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<td class=\"text-button\" style=\"background:#ffda5c; color:#444444; font-family:'Merriweather', Georgia,serif; font-size:14px; line-height:18px; padding:12px 15px; text-align:center; border-radius:10px; text-transform:uppercase;\"><span class=\"link\" style=\"color:#000001; text-decoration:none;\">DKK 500 a year</span></td>\n" +
                "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t</tr>\n" +
                "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t</table>\n" +
                "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t</td>\n" +
                "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t</tr>\n" +
                "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<!-- END Button -->\n" +
                "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t</table>\n" +
                "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t</td>\n" +
                "\t\t\t\t\t\t\t\t\t\t\t\t\t\t</tr>\n" +
                "\t\t\t\t\t\t\t\t\t\t\t\t\t</table>\n" +
                "\t\t\t\t\t\t\t\t\t\t\t\t</th>\n" +
                "\t\t\t\t\t\t\t\t\t\t\t\t<th class=\"column\" width=\"50\" style=\"font-size:0pt; line-height:0pt; padding:0; margin:0; font-weight:normal;\"></th>\n" +
                "\t\t\t\t\t\t\t\t\t\t\t</tr>\n" +
                "\t\t\t\t\t\t\t\t\t\t</table>\n" +
                "\t\t\t\t\t\t\t\t\t</td>\n" +
                "\t\t\t\t\t\t\t\t</tr>\n" +
                "\t\t\t\t\t\t\t</table>\n" +
                "\t\t\t\t\t\t\t<!-- END Article / Blue Background -->\n" +
                "\n" +
                "\t\t\t\t\t\t\t<!-- Article / White Background -->\n" +
                "\t\t\t\t\t\t\t<table width=\"100%\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\n" +
                "\t\t\t\t\t\t\t\t<tr>\n" +
                "\t\t\t\t\t\t\t\t\t<td bgcolor=\"#ffffff\">\n" +
                "\t\t\t\t\t\t\t\t\t\t<table width=\"100%\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\" dir=\"rtl\" style=\"direction: rtl;\">\n" +
                "\t\t\t\t\t\t\t\t\t\t\t<tr>\n" +
                "\t\t\t\t\t\t\t\t\t\t\t\t<th class=\"column-dir-top\" dir=\"ltr\" width=\"217\" style=\"font-size:0pt; line-height:0pt; padding:0; margin:0; font-weight:normal; direction:ltr; vertical-align:top;\">\n" +
                "\t\t\t\t\t\t\t\t\t\t\t\t\t<table width=\"100%\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\n" +
                "\t\t\t\t\t\t\t\t\t\t\t\t\t\t<tr>\n" +
                "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<td class=\"fluid-img\" style=\"font-size:0pt; line-height:0pt; text-align:left;\"><img src=\"https://github.com/simonbucko/DolphinSwimClub/blob/master/img/active_junior_img.JPG?raw=true\" width=\"217\" height=\"440\" border=\"0\" alt=\"\" /></td>\n" +
                "\t\t\t\t\t\t\t\t\t\t\t\t\t\t</tr>\n" +
                "\t\t\t\t\t\t\t\t\t\t\t\t\t</table>\n" +
                "\t\t\t\t\t\t\t\t\t\t\t\t</th>\n" +
                "\t\t\t\t\t\t\t\t\t\t\t\t<th class=\"column-dir\" dir=\"ltr\" width=\"50\" style=\"font-size:0pt; line-height:0pt; padding:0; margin:0; font-weight:normal; direction:ltr;\"></th>\n" +
                "\t\t\t\t\t\t\t\t\t\t\t\t<th class=\"column-dir\" dir=\"ltr\" style=\"font-size:0pt; line-height:0pt; padding:0; margin:0; font-weight:normal; direction:ltr;\">\n" +
                "\t\t\t\t\t\t\t\t\t\t\t\t\t<table width=\"100%\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\n" +
                "\t\t\t\t\t\t\t\t\t\t\t\t\t\t<tr>\n" +
                "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<td class=\"p30-15\">\n" +
                "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<table width=\"100%\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\n" +
                "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<tr>\n" +
                "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<td class=\"h3 pb20\" style=\"color:#000000; font-family:'Merriweather', Georgia,serif; font-size:25px; line-height:32px; text-align:left; padding-bottom:20px;\">\n" +
                "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tActive Junior Membership\n" +
                "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t</td>\n" +
                "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t</tr>\n" +
                "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<tr>\n" +
                "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<td class=\"text pb20\" style=\"color:#666666; font-family:Arial,sans-serif; font-size:14px; line-height:26px; text-align:left; padding-bottom:20px;\">Active junior membership if for you, if you are younger than 18 years and you want to dedicate more time to your swimming activities. It is also great for you, if you desire to improve your technique and condition as well</td>\n" +
                "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t</tr>\n" +
                "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<tr>\n" +
                "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<td class=\"pb20\" style=\"padding-bottom:20px;\">\n" +
                "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<table width=\"100%\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\n" +
                "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<tr>\n" +
                "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<td class=\"pb10\" style=\"padding-bottom:10px;\">\n" +
                "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<table width=\"100%\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\n" +
                "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<tr>\n" +
                "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<td valign=\"top\" class=\"img\" width=\"20\" style=\"font-size:0pt; line-height:0pt; text-align:left;\"></td>\n" +
                "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<td valign=\"top\" class=\"img\" width=\"24\" style=\"font-size:0pt; line-height:0pt; text-align:left;\"><img src=\"images/t3_ico_blue_check.png\" width=\"12\" height=\"15\" border=\"0\" alt=\"\" /></td>\n" +
                "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<td valign=\"top\" class=\"text2\" style=\"color:#666666; font-family:'Merriweather', Georgia,serif; font-size:14px; line-height:26px; text-align:left; font-style:italic;\">Unlimited access to the swimming pool</td>\n" +
                "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t</tr>\n" +
                "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t</table>\n" +
                "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t</td>\n" +
                "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t</tr>\n" +
                "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<tr>\n" +
                "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<td class=\"pb10\" style=\"padding-bottom:10px;\">\n" +
                "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<table width=\"100%\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\n" +
                "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<tr>\n" +
                "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<td valign=\"top\" class=\"img\" width=\"20\" style=\"font-size:0pt; line-height:0pt; text-align:left;\"></td>\n" +
                "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<td valign=\"top\" class=\"img\" width=\"24\" style=\"font-size:0pt; line-height:0pt; text-align:left;\"><img src=\"images/t3_ico_blue_check.png\" width=\"12\" height=\"15\" border=\"0\" alt=\"\" /></td>\n" +
                "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<td valign=\"top\" class=\"text2\" style=\"color:#666666; font-family:'Merriweather', Georgia,serif; font-size:14px; line-height:26px; text-align:left; font-style:italic;\">Unlimited access to the gym</td>\n" +
                "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t</tr>\n" +
                "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t</table>\n" +
                "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t</td>\n" +
                "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t</tr>\n" +
                "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<tr>\n" +
                "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<td class=\"pb10\" style=\"padding-bottom:10px;\">\n" +
                "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<table width=\"100%\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\n" +
                "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<tr>\n" +
                "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<td valign=\"top\" class=\"img\" width=\"20\" style=\"font-size:0pt; line-height:0pt; text-align:left;\"></td>\n" +
                "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<td valign=\"top\" class=\"img\" width=\"24\" style=\"font-size:0pt; line-height:0pt; text-align:left;\"><img src=\"images/t3_ico_blue_check.png\" width=\"12\" height=\"15\" border=\"0\" alt=\"\" /></td>\n" +
                "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<td valign=\"top\" class=\"text2\" style=\"color:#666666; font-family:'Merriweather', Georgia,serif; font-size:14px; line-height:26px; text-align:left; font-style:italic;\">Option to join swimming courses</td>\n" +
                "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t</tr>\n" +
                "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t</table>\n" +
                "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t</td>\n" +
                "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t</tr>\n" +
                "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<tr>\n" +
                "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<td class=\"pb10\" style=\"padding-bottom:10px;\">\n" +
                "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<table width=\"100%\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\n" +
                "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<tr>\n" +
                "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<td valign=\"top\" class=\"img\" width=\"20\" style=\"font-size:0pt; line-height:0pt; text-align:left;\"></td>\n" +
                "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<td valign=\"top\" class=\"img\" width=\"24\" style=\"font-size:0pt; line-height:0pt; text-align:left;\"><img src=\"images/t3_ico_blue_check.png\" width=\"12\" height=\"15\" border=\"0\" alt=\"\" /></td>\n" +
                "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<td valign=\"top\" class=\"text2\" style=\"color:#666666; font-family:'Merriweather', Georgia,serif; font-size:14px; line-height:26px; text-align:left; font-style:italic;\">Access to swimming equipment</td>\n" +
                "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t</tr>\n" +
                "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t</table>\n" +
                "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t</td>\n" +
                "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t</tr>\n" +
                "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t</table>\n" +
                "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t</td>\n" +
                "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t</tr>\n" +
                "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<!-- Button -->\n" +
                "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<tr>\n" +
                "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<td align=\"left\">\n" +
                "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<table border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\n" +
                "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<tr>\n" +
                "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<td class=\"text-button\" style=\"background:#ffda5c; color:#444444; font-family:'Merriweather', Georgia,serif; font-size:14px; line-height:18px; padding:12px 15px; text-align:center; border-radius:10px; text-transform:uppercase;\"><span class=\"link\" style=\"color:#000001; text-decoration:none;\">DKK 1000 a year</span></td>\n" +
                "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t</tr>\n" +
                "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t</table>\n" +
                "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t</td>\n" +
                "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t</tr>\n" +
                "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<!-- END Button -->\n" +
                "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t</table>\n" +
                "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t</td>\n" +
                "\t\t\t\t\t\t\t\t\t\t\t\t\t\t</tr>\n" +
                "\t\t\t\t\t\t\t\t\t\t\t\t\t</table>\n" +
                "\t\t\t\t\t\t\t\t\t\t\t\t</th>\n" +
                "\t\t\t\t\t\t\t\t\t\t\t\t<th class=\"column\" width=\"50\" style=\"font-size:0pt; line-height:0pt; padding:0; margin:0; font-weight:normal;\"></th>\n" +
                "\t\t\t\t\t\t\t\t\t\t\t</tr>\n" +
                "\t\t\t\t\t\t\t\t\t\t</table>\n" +
                "\t\t\t\t\t\t\t\t\t</td>\n" +
                "\t\t\t\t\t\t\t\t</tr>\n" +
                "\t\t\t\t\t\t\t</table>\n" +
                "\t\t\t\t\t\t\t<!-- END Article / White Background -->\n" +
                "\n" +
                "\t\t\t\t\t\t\t<table width=\"100%\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\n" +
                "\t\t\t\t\t\t\t\t<tr>\n" +
                "\t\t\t\t\t\t\t\t\t<td bgcolor=\"#34a1e6\">\n" +
                "\t\t\t\t\t\t\t\t\t\t<table width=\"100%\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\n" +
                "\t\t\t\t\t\t\t\t\t\t\t<tr>\n" +
                "\t\t\t\t\t\t\t\t\t\t\t\t<th class=\"column-top\" dir=\"ltr\" width=\"217\" style=\"font-size:0pt; line-height:0pt; padding:0; margin:0; font-weight:normal; vertical-align:top;\">\n" +
                "\t\t\t\t\t\t\t\t\t\t\t\t\t<table width=\"100%\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\n" +
                "\t\t\t\t\t\t\t\t\t\t\t\t\t\t<tr>\n" +
                "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<td class=\"fluid-img\" style=\"font-size:0pt; line-height:0pt; text-align:left;\"><img src=\"https://github.com/simonbucko/DolphinSwimClub/blob/master/img/active_img.jpg?raw=true\" width=\"217\" height=\"440\" border=\"0\" alt=\"\" /></td>\n" +
                "\t\t\t\t\t\t\t\t\t\t\t\t\t\t</tr>\n" +
                "\t\t\t\t\t\t\t\t\t\t\t\t\t</table>\n" +
                "\t\t\t\t\t\t\t\t\t\t\t\t</th>\n" +
                "\t\t\t\t\t\t\t\t\t\t\t\t<th class=\"column\" width=\"50\" style=\"font-size:0pt; line-height:0pt; padding:0; margin:0; font-weight:normal;\"></th>\n" +
                "\t\t\t\t\t\t\t\t\t\t\t\t<th class=\"column\" style=\"font-size:0pt; line-height:0pt; padding:0; margin:0; font-weight:normal;\">\n" +
                "\t\t\t\t\t\t\t\t\t\t\t\t\t<table width=\"100%\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\n" +
                "\t\t\t\t\t\t\t\t\t\t\t\t\t\t<tr>\n" +
                "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<td class=\"p30-15\">\n" +
                "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<table width=\"100%\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\n" +
                "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<tr>\n" +
                "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<td class=\"h3 white pb20\" style=\"font-family:'Merriweather', Georgia,serif; font-size:25px; line-height:32px; text-align:left; color:#ffffff; padding-bottom:20px;\">\n" +
                "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tActive Membership\n" +
                "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t</td>\n" +
                "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t</tr>\n" +
                "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<tr>\n" +
                "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<td class=\"text white pb20\" style=\"font-family:Arial,sans-serif; font-size:14px; line-height:26px; text-align:left; color:#ffffff; padding-bottom:20px;\">Active junior membership if for you, if you are older than 18 years and younger than 60 years and you want to dedicate more time to your swimming activities. It is also great for you, if you desire to improve your technique and condition as well</td>\n" +
                "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t</tr>\n" +
                "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<tr>\n" +
                "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<td class=\"pb20\" style=\"padding-bottom:20px;\">\n" +
                "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<table width=\"100%\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\n" +
                "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<tr>\n" +
                "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<td class=\"pb10\" style=\"padding-bottom:10px;\">\n" +
                "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<table width=\"100%\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\n" +
                "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<tr>\n" +
                "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<td valign=\"top\" class=\"img\" width=\"20\" style=\"font-size:0pt; line-height:0pt; text-align:left;\"></td>\n" +
                "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<td valign=\"top\" class=\"img\" width=\"24\" style=\"font-size:0pt; line-height:0pt; text-align:left;\"><img src=\"images/t3_ico_yellow_check.png\" width=\"12\" height=\"15\" border=\"0\" alt=\"\" /></td>\n" +
                "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<td valign=\"top\" class=\"text2 white\" style=\"font-family:'Merriweather', Georgia,serif; font-size:14px; line-height:26px; text-align:left; font-style:italic; color:#ffffff;\">Unlimited access to the swimming pool</td>\n" +
                "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t</tr>\n" +
                "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<tr>\n" +
                "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<td valign=\"top\" class=\"img\" width=\"20\" style=\"font-size:0pt; line-height:0pt; text-align:left;\"></td>\n" +
                "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<td valign=\"top\" class=\"img\" width=\"24\" style=\"font-size:0pt; line-height:0pt; text-align:left;\"><img src=\"images/t3_ico_yellow_check.png\" width=\"12\" height=\"15\" border=\"0\" alt=\"\" /></td>\n" +
                "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<td valign=\"top\" class=\"text2 white\" style=\"font-family:'Merriweather', Georgia,serif; font-size:14px; line-height:26px; text-align:left; font-style:italic; color:#ffffff;\">Unlimited access to the gym</td>\n" +
                "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t</tr>\n" +
                "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<tr>\n" +
                "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<td valign=\"top\" class=\"img\" width=\"20\" style=\"font-size:0pt; line-height:0pt; text-align:left;\"></td>\n" +
                "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<td valign=\"top\" class=\"img\" width=\"24\" style=\"font-size:0pt; line-height:0pt; text-align:left;\"><img src=\"images/t3_ico_yellow_check.png\" width=\"12\" height=\"15\" border=\"0\" alt=\"\" /></td>\n" +
                "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<td valign=\"top\" class=\"text2 white\" style=\"font-family:'Merriweather', Georgia,serif; font-size:14px; line-height:26px; text-align:left; font-style:italic; color:#ffffff;\">Option to join swimming courses</td>\n" +
                "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t</tr>\n" +
                "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<tr>\n" +
                "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<td valign=\"top\" class=\"img\" width=\"20\" style=\"font-size:0pt; line-height:0pt; text-align:left;\"></td>\n" +
                "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<td valign=\"top\" class=\"img\" width=\"24\" style=\"font-size:0pt; line-height:0pt; text-align:left;\"><img src=\"images/t3_ico_yellow_check.png\" width=\"12\" height=\"15\" border=\"0\" alt=\"\" /></td>\n" +
                "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<td valign=\"top\" class=\"text2 white\" style=\"font-family:'Merriweather', Georgia,serif; font-size:14px; line-height:26px; text-align:left; font-style:italic; color:#ffffff;\">Access to swimming equipment</td>\n" +
                "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t</tr>\n" +
                "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t</table>\n" +
                "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t</td>\n" +
                "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t</tr>\n" +
                "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t</table>\n" +
                "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t</td>\n" +
                "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t</tr>\n" +
                "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<!-- Button -->\n" +
                "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<tr>\n" +
                "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<td align=\"left\">\n" +
                "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<table border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\n" +
                "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<tr>\n" +
                "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<td class=\"text-button\" style=\"background:#ffda5c; color:#444444; font-family:'Merriweather', Georgia,serif; font-size:14px; line-height:18px; padding:12px 15px; text-align:center; border-radius:10px; text-transform:uppercase;\"><span class=\"link\" style=\"color:#000001; text-decoration:none;\">DKK 1600 a year</span></td>\n" +
                "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t</tr>\n" +
                "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t</table>\n" +
                "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t</td>\n" +
                "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t</tr>\n" +
                "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<!-- END Button -->\n" +
                "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t</table>\n" +
                "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t</td>\n" +
                "\t\t\t\t\t\t\t\t\t\t\t\t\t\t</tr>\n" +
                "\t\t\t\t\t\t\t\t\t\t\t\t\t</table>\n" +
                "\t\t\t\t\t\t\t\t\t\t\t\t</th>\n" +
                "\t\t\t\t\t\t\t\t\t\t\t\t<th class=\"column\" width=\"50\" style=\"font-size:0pt; line-height:0pt; padding:0; margin:0; font-weight:normal;\"></th>\n" +
                "\t\t\t\t\t\t\t\t\t\t\t</tr>\n" +
                "\t\t\t\t\t\t\t\t\t\t</table>\n" +
                "\t\t\t\t\t\t\t\t\t</td>\n" +
                "\t\t\t\t\t\t\t\t</tr>\n" +
                "\t\t\t\t\t\t\t</table>\n" +
                "\n" +
                "\t\t\t\t\t\t\t<table width=\"100%\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\n" +
                "\t\t\t\t\t\t\t\t<tr>\n" +
                "\t\t\t\t\t\t\t\t\t<td bgcolor=\"#ffffff\">\n" +
                "\t\t\t\t\t\t\t\t\t\t<table width=\"100%\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\" dir=\"rtl\" style=\"direction: rtl;\">\n" +
                "\t\t\t\t\t\t\t\t\t\t\t<tr>\n" +
                "\t\t\t\t\t\t\t\t\t\t\t\t<th class=\"column-dir-top\" dir=\"ltr\" width=\"217\" style=\"font-size:0pt; line-height:0pt; padding:0; margin:0; font-weight:normal; direction:ltr; vertical-align:top;\">\n" +
                "\t\t\t\t\t\t\t\t\t\t\t\t\t<table width=\"100%\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\n" +
                "\t\t\t\t\t\t\t\t\t\t\t\t\t\t<tr>\n" +
                "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<td class=\"fluid-img\" style=\"font-size:0pt; line-height:0pt; text-align:left;\"><img src=\"https://github.com/simonbucko/DolphinSwimClub/blob/master/img/active_senior_img.JPG?raw=true\" width=\"217\" height=\"440\" border=\"0\" alt=\"\" /></td>\n" +
                "\t\t\t\t\t\t\t\t\t\t\t\t\t\t</tr>\n" +
                "\t\t\t\t\t\t\t\t\t\t\t\t\t</table>\n" +
                "\t\t\t\t\t\t\t\t\t\t\t\t</th>\n" +
                "\t\t\t\t\t\t\t\t\t\t\t\t<th class=\"column-dir\" dir=\"ltr\" width=\"50\" style=\"font-size:0pt; line-height:0pt; padding:0; margin:0; font-weight:normal; direction:ltr;\"></th>\n" +
                "\t\t\t\t\t\t\t\t\t\t\t\t<th class=\"column-dir\" dir=\"ltr\" style=\"font-size:0pt; line-height:0pt; padding:0; margin:0; font-weight:normal; direction:ltr;\">\n" +
                "\t\t\t\t\t\t\t\t\t\t\t\t\t<table width=\"100%\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\n" +
                "\t\t\t\t\t\t\t\t\t\t\t\t\t\t<tr>\n" +
                "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<td class=\"p30-15\">\n" +
                "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<table width=\"100%\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\n" +
                "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<tr>\n" +
                "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<td class=\"h3 pb20\" style=\"color:#000000; font-family:'Merriweather', Georgia,serif; font-size:25px; line-height:32px; text-align:left; padding-bottom:20px;\">\n" +
                "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tActive Senior Membership\n" +
                "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t</td>\n" +
                "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t</tr>\n" +
                "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<tr>\n" +
                "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<td class=\"text pb20\" style=\"color:#666666; font-family:Arial,sans-serif; font-size:14px; line-height:26px; text-align:left; padding-bottom:20px;\">Active junior membership if for you, if you are older than 60 years and you want to dedicate more time to your swimming activities. It is also great for you, if you desire to improve your technique and condition as well</td>\n" +
                "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t</tr>\n" +
                "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<tr>\n" +
                "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<td class=\"pb20\" style=\"padding-bottom:20px;\">\n" +
                "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<table width=\"100%\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\n" +
                "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<tr>\n" +
                "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<td class=\"pb10\" style=\"padding-bottom:10px;\">\n" +
                "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<table width=\"100%\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\n" +
                "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<tr>\n" +
                "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<td valign=\"top\" class=\"img\" width=\"20\" style=\"font-size:0pt; line-height:0pt; text-align:left;\"></td>\n" +
                "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<td valign=\"top\" class=\"img\" width=\"24\" style=\"font-size:0pt; line-height:0pt; text-align:left;\"><img src=\"images/t3_ico_blue_check.png\" width=\"12\" height=\"15\" border=\"0\" alt=\"\" /></td>\n" +
                "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<td valign=\"top\" class=\"text2\" style=\"color:#666666; font-family:'Merriweather', Georgia,serif; font-size:14px; line-height:26px; text-align:left; font-style:italic;\">Unlimited access to the swimming pool</td>\n" +
                "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t</tr>\n" +
                "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t</table>\n" +
                "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t</td>\n" +
                "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t</tr>\n" +
                "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<tr>\n" +
                "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<td class=\"pb10\" style=\"padding-bottom:10px;\">\n" +
                "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<table width=\"100%\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\n" +
                "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<tr>\n" +
                "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<td valign=\"top\" class=\"img\" width=\"20\" style=\"font-size:0pt; line-height:0pt; text-align:left;\"></td>\n" +
                "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<td valign=\"top\" class=\"img\" width=\"24\" style=\"font-size:0pt; line-height:0pt; text-align:left;\"><img src=\"images/t3_ico_blue_check.png\" width=\"12\" height=\"15\" border=\"0\" alt=\"\" /></td>\n" +
                "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<td valign=\"top\" class=\"text2\" style=\"color:#666666; font-family:'Merriweather', Georgia,serif; font-size:14px; line-height:26px; text-align:left; font-style:italic;\">Unlimited access to the gym</td>\n" +
                "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t</tr>\n" +
                "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t</table>\n" +
                "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t</td>\n" +
                "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t</tr>\n" +
                "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<tr>\n" +
                "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<td class=\"pb10\" style=\"padding-bottom:10px;\">\n" +
                "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<table width=\"100%\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\n" +
                "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<tr>\n" +
                "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<td valign=\"top\" class=\"img\" width=\"20\" style=\"font-size:0pt; line-height:0pt; text-align:left;\"></td>\n" +
                "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<td valign=\"top\" class=\"img\" width=\"24\" style=\"font-size:0pt; line-height:0pt; text-align:left;\"><img src=\"images/t3_ico_blue_check.png\" width=\"12\" height=\"15\" border=\"0\" alt=\"\" /></td>\n" +
                "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<td valign=\"top\" class=\"text2\" style=\"color:#666666; font-family:'Merriweather', Georgia,serif; font-size:14px; line-height:26px; text-align:left; font-style:italic;\">Option to join swimming courses</td>\n" +
                "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t</tr>\n" +
                "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t</table>\n" +
                "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t</td>\n" +
                "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t</tr>\n" +
                "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<tr>\n" +
                "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<td class=\"pb10\" style=\"padding-bottom:10px;\">\n" +
                "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<table width=\"100%\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\n" +
                "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<tr>\n" +
                "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<td valign=\"top\" class=\"img\" width=\"20\" style=\"font-size:0pt; line-height:0pt; text-align:left;\"></td>\n" +
                "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<td valign=\"top\" class=\"img\" width=\"24\" style=\"font-size:0pt; line-height:0pt; text-align:left;\"><img src=\"images/t3_ico_blue_check.png\" width=\"12\" height=\"15\" border=\"0\" alt=\"\" /></td>\n" +
                "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<td valign=\"top\" class=\"text2\" style=\"color:#666666; font-family:'Merriweather', Georgia,serif; font-size:14px; line-height:26px; text-align:left; font-style:italic;\">Access to swimming equipment</td>\n" +
                "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t</tr>\n" +
                "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t</table>\n" +
                "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t</td>\n" +
                "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t</tr>\n" +
                "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t</table>\n" +
                "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t</td>\n" +
                "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t</tr>\n" +
                "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<!-- Button -->\n" +
                "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<tr>\n" +
                "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<td align=\"left\">\n" +
                "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<table border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\n" +
                "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<tr>\n" +
                "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<td class=\"text-button\" style=\"background:#ffda5c; color:#444444; font-family:'Merriweather', Georgia,serif; font-size:14px; line-height:18px; padding:12px 15px; text-align:center; border-radius:10px; text-transform:uppercase;\"><span class=\"link\" style=\"color:#000001; text-decoration:none;\">DKK 1000 a year</span></td>\n" +
                "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t</tr>\n" +
                "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t</table>\n" +
                "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t</td>\n" +
                "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t</tr>\n" +
                "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<!-- END Button -->\n" +
                "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t</table>\n" +
                "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t</td>\n" +
                "\t\t\t\t\t\t\t\t\t\t\t\t\t\t</tr>\n" +
                "\t\t\t\t\t\t\t\t\t\t\t\t\t</table>\n" +
                "\t\t\t\t\t\t\t\t\t\t\t\t</th>\n" +
                "\t\t\t\t\t\t\t\t\t\t\t\t<th class=\"column\" width=\"50\" style=\"font-size:0pt; line-height:0pt; padding:0; margin:0; font-weight:normal;\"></th>\n" +
                "\t\t\t\t\t\t\t\t\t\t\t</tr>\n" +
                "\t\t\t\t\t\t\t\t\t\t</table>\n" +
                "\t\t\t\t\t\t\t\t\t</td>\n" +
                "\t\t\t\t\t\t\t\t</tr>\n" +
                "\t\t\t\t\t\t\t</table>\n" +
                "\n" +
                "\t\t\t\t\t\t\t<!-- Article / Purple Background -->\n" +
                "\t\t\t\t\t\t\t<table width=\"100%\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\n" +
                "\t\t\t\t\t\t\t\t<tr>\n" +
                "\t\t\t\t\t\t\t\t\t<td bgcolor=\"#34a1e6\">\n" +
                "\t\t\t\t\t\t\t\t\t\t<table width=\"100%\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\n" +
                "\t\t\t\t\t\t\t\t\t\t\t<tr>\n" +
                "\t\t\t\t\t\t\t\t\t\t\t\t<th class=\"column-top\" dir=\"ltr\" width=\"217\" style=\"font-size:0pt; line-height:0pt; padding:0; margin:0; font-weight:normal; vertical-align:top;\">\n" +
                "\t\t\t\t\t\t\t\t\t\t\t\t\t<table width=\"100%\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\n" +
                "\t\t\t\t\t\t\t\t\t\t\t\t\t\t<tr>\n" +
                "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<td class=\"fluid-img\" style=\"font-size:0pt; line-height:0pt; text-align:left;\"><img src=\"https://github.com/simonbucko/DolphinSwimClub/blob/master/img/elite_img.jpg?raw=true\" width=\"217\" height=\"440\" border=\"0\" alt=\"\" /></td>\n" +
                "\t\t\t\t\t\t\t\t\t\t\t\t\t\t</tr>\n" +
                "\t\t\t\t\t\t\t\t\t\t\t\t\t</table>\n" +
                "\t\t\t\t\t\t\t\t\t\t\t\t</th>\n" +
                "\t\t\t\t\t\t\t\t\t\t\t\t<th class=\"column\" width=\"50\" style=\"font-size:0pt; line-height:0pt; padding:0; margin:0; font-weight:normal;\"></th>\n" +
                "\t\t\t\t\t\t\t\t\t\t\t\t<th class=\"column\" style=\"font-size:0pt; line-height:0pt; padding:0; margin:0; font-weight:normal;\">\n" +
                "\t\t\t\t\t\t\t\t\t\t\t\t\t<table width=\"100%\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\n" +
                "\t\t\t\t\t\t\t\t\t\t\t\t\t\t<tr>\n" +
                "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<td class=\"p30-15\">\n" +
                "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<table width=\"100%\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\n" +
                "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<tr>\n" +
                "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<td class=\"h3 white pb20\" style=\"font-family:'Merriweather', Georgia,serif; font-size:25px; line-height:32px; text-align:left; color:#ffffff; padding-bottom:20px;\">\n" +
                "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tElite Membership\n" +
                "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t</td>\n" +
                "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t</tr>\n" +
                "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<tr>\n" +
                "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<td class=\"text white pb20\" style=\"font-family:Arial,sans-serif; font-size:14px; line-height:26px; text-align:left; color:#ffffff; padding-bottom:20px;\">Do you feel, that you need more or would you like to do swimming competitively? If YES, this is right membership for you! You will have assigned a coach, that we will help you to achieve your ambitions. </td>\n" +
                "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t</tr>\n" +
                "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<tr>\n" +
                "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<td class=\"pb20\" style=\"padding-bottom:20px;\">\n" +
                "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<table width=\"100%\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\n" +
                "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<tr>\n" +
                "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<td class=\"pb10\" style=\"padding-bottom:10px;\">\n" +
                "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<table width=\"100%\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\n" +
                "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<tr>\n" +
                "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<td valign=\"top\" class=\"img\" width=\"20\" style=\"font-size:0pt; line-height:0pt; text-align:left;\"></td>\n" +
                "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<td valign=\"top\" class=\"img\" width=\"24\" style=\"font-size:0pt; line-height:0pt; text-align:left;\"><img src=\"images/t3_ico_yellow_check.png\" width=\"12\" height=\"15\" border=\"0\" alt=\"\" /></td>\n" +
                "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<td valign=\"top\" class=\"text2 white\" style=\"font-family:'Merriweather', Georgia,serif; font-size:14px; line-height:26px; text-align:left; font-style:italic; color:#ffffff;\">Perks and benefits of Active Membership</td>\n" +
                "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t</tr>\n" +
                "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t</table>\n" +
                "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t</td>\n" +
                "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t</tr>\n" +
                "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<tr>\n" +
                "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<td class=\"pb10\" style=\"padding-bottom:10px;\">\n" +
                "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<table width=\"100%\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\n" +
                "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<tr>\n" +
                "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<td valign=\"top\" class=\"img\" width=\"20\" style=\"font-size:0pt; line-height:0pt; text-align:left;\"></td>\n" +
                "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<td valign=\"top\" class=\"img\" width=\"24\" style=\"font-size:0pt; line-height:0pt; text-align:left;\"><img src=\"images/t3_ico_yellow_check.png\" width=\"12\" height=\"15\" border=\"0\" alt=\"\" /></td>\n" +
                "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<td valign=\"top\" class=\"text2 white\" style=\"font-family:'Merriweather', Georgia,serif; font-size:14px; line-height:26px; text-align:left; font-style:italic; color:#ffffff;\">Assigned a professional coach</td>\n" +
                "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t</tr>\n" +
                "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t</table>\n" +
                "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t</td>\n" +
                "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t</tr>\n" +
                "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<tr>\n" +
                "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<td class=\"pb10\" style=\"padding-bottom:10px;\">\n" +
                "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<table width=\"100%\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\n" +
                "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<tr>\n" +
                "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<td valign=\"top\" class=\"img\" width=\"20\" style=\"font-size:0pt; line-height:0pt; text-align:left;\"></td>\n" +
                "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<td valign=\"top\" class=\"img\" width=\"24\" style=\"font-size:0pt; line-height:0pt; text-align:left;\"><img src=\"images/t3_ico_yellow_check.png\" width=\"12\" height=\"15\" border=\"0\" alt=\"\" /></td>\n" +
                "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<td valign=\"top\" class=\"text2 white\" style=\"font-family:'Merriweather', Georgia,serif; font-size:14px; line-height:26px; text-align:left; font-style:italic; color:#ffffff;\">Option to join a swimming race</td>\n" +
                "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t</tr>\n" +
                "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t</table>\n" +
                "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t</td>\n" +
                "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t</tr>\n" +
                "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<tr>\n" +
                "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<td class=\"pb10\" style=\"padding-bottom:10px;\">\n" +
                "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<table width=\"100%\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\n" +
                "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<tr>\n" +
                "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<td valign=\"top\" class=\"img\" width=\"20\" style=\"font-size:0pt; line-height:0pt; text-align:left;\"></td>\n" +
                "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<td valign=\"top\" class=\"img\" width=\"24\" style=\"font-size:0pt; line-height:0pt; text-align:left;\"><img src=\"images/t3_ico_yellow_check.png\" width=\"12\" height=\"15\" border=\"0\" alt=\"\" /></td>\n" +
                "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<td valign=\"top\" class=\"text2 white\" style=\"font-family:'Merriweather', Georgia,serif; font-size:14px; line-height:26px; text-align:left; font-style:italic; color:#ffffff;\">Register of your results</td>\n" +
                "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t</tr>\n" +
                "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t</table>\n" +
                "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t</td>\n" +
                "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t</tr>\n" +
                "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t</table>\n" +
                "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t</td>\n" +
                "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t</tr>\n" +
                "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<!-- Button -->\n" +
                "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<tr>\n" +
                "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<td align=\"left\">\n" +
                "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<table border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\n" +
                "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<tr>\n" +
                "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<td class=\"text-button\" style=\"background:#ffda5c; color:#444444; font-family:'Merriweather', Georgia,serif; font-size:14px; line-height:18px; padding:12px 15px; text-align:center; border-radius:10px; text-transform:uppercase;\"><span class=\"link\" style=\"color:#000001; text-decoration:none;\">DKK 2500 a year</span></td>\n" +
                "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t</tr>\n" +
                "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t</table>\n" +
                "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t</td>\n" +
                "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t</tr>\n" +
                "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<!-- END Button -->\n" +
                "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t</table>\n" +
                "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t</td>\n" +
                "\t\t\t\t\t\t\t\t\t\t\t\t\t\t</tr>\n" +
                "\t\t\t\t\t\t\t\t\t\t\t\t\t</table>\n" +
                "\t\t\t\t\t\t\t\t\t\t\t\t</th>\n" +
                "\t\t\t\t\t\t\t\t\t\t\t\t<th class=\"column\" width=\"50\" style=\"font-size:0pt; line-height:0pt; padding:0; margin:0; font-weight:normal;\"></th>\n" +
                "\t\t\t\t\t\t\t\t\t\t\t</tr>\n" +
                "\t\t\t\t\t\t\t\t\t\t</table>\n" +
                "\t\t\t\t\t\t\t\t\t</td>\n" +
                "\t\t\t\t\t\t\t\t</tr>\n" +
                "\t\t\t\t\t\t\t</table>\n" +
                "\t\t\t\t\t\t\t<!-- END Article / Purple Background -->\n" +
                "\n" +
                "\n" +
                "\t\t\t\t\t\t\t<!-- CTA -->\n" +
                "\t\t\t\t\t\t\t<table width=\"100%\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\n" +
                "\t\t\t\t\t\t\t\t<tr>\n" +
                "\t\t\t\t\t\t\t\t\t<td style=\"padding: 70px 30px 70px 30px;\" class=\"p30-15\" bgcolor=\"#ffda5c\">\n" +
                "\t\t\t\t\t\t\t\t\t\t<table width=\"100%\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\n" +
                "\t\t\t\t\t\t\t\t\t\t\t<tr>\n" +
                "\t\t\t\t\t\t\t\t\t\t\t\t<td class=\"h2 pb30\" style=\"color:#444444; font-family:'Merriweather', Georgia,serif; font-size:30px; line-height:36px; text-align:center; padding-bottom:30px;\">Do not hesitate, and renew your membership now!</td>\n" +
                "\t\t\t\t\t\t\t\t\t\t\t</tr>\n" +
                "\t\t\t\t\t\t\t\t\t\t\t<tr>\n" +
                "\t\t\t\t\t\t\t\t\t\t\t\t<td class=\"text-center2 pb30\" style=\"color:#444444; font-family:Arial,sans-serif; font-size:16px; line-height:30px; text-align:center; padding-bottom:30px;\">Just choose your subscription from listed options, pick your phone,call us and we will guide you through aplication! We are looking forward to hear from you!</td>\n" +
                "\t\t\t\t\t\t\t\t\t\t\t</tr>\n" +
                "\t\t\t\t\t\t\t\t\t\t\t<!-- Button -->\n" +
                "\t\t\t\t\t\t\t\t\t\t\t<tr>\n" +
                "\t\t\t\t\t\t\t\t\t\t\t\t<td align=\"center\">\n" +
                "\t\t\t\t\t\t\t\t\t\t\t\t\t<table class=\"center\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\" style=\"text-align:center;\">\n" +
                "\t\t\t\t\t\t\t\t\t\t\t\t\t\t<tr>\n" +
                "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<td class=\"text-button blue-button\" style=\"color:#444444; font-family:'Merriweather', Georgia,serif; font-size:14px; line-height:18px; text-align:center; border-radius:10px; text-transform:uppercase; background:#001f51; padding:12px 30px;\"><span class=\"link-yellow\" style=\"color:#ffda5c; text-decoration:none;\">CONTACT US</span></td>\n" +
                "\t\t\t\t\t\t\t\t\t\t\t\t\t\t</tr>\n" +
                "\t\t\t\t\t\t\t\t\t\t\t\t\t</table>\n" +
                "\t\t\t\t\t\t\t\t\t\t\t\t</td>\n" +
                "\t\t\t\t\t\t\t\t\t\t\t</tr>\n" +
                "\t\t\t\t\t\t\t\t\t\t\t<!-- END Button -->\n" +
                "\t\t\t\t\t\t\t\t\t\t</table>\n" +
                "\t\t\t\t\t\t\t\t\t</td>\n" +
                "\t\t\t\t\t\t\t\t</tr>\n" +
                "\t\t\t\t\t\t\t</table>\n" +
                "\t\t\t\t\t\t\t<!-- END CTA -->\n" +
                "\t\t\t\t\t\t\t\n" +
                "\t\t\t\t\t\t\t<!-- Banner -->\n" +
                "\t\t\t\t\t\t\t<table width=\"100%\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\n" +
                "\t\t\t\t\t\t\t\t<tr>\n" +
                "\t\t\t\t\t\t\t\t\t<td class=\"fluid-img\" style=\"font-size:0pt; line-height:0pt; text-align:left;\"><img src=\"https://github.com/simonbucko/DolphinSwimClub/blob/master/img/footer_img.jpg?raw=true\" width=\"650\" height=\"auto\" border=\"0\" alt=\"\" /></td>\n" +
                "\t\t\t\t\t\t\t\t</tr>\n" +
                "\t\t\t\t\t\t\t</table>\n" +
                "\t\t\t\t\t\t\t<!-- END Banner -->\n" +
                "\n" +
                "\t\t\t\t\t\t\t<!-- Footer -->\n" +
                "\t\t\t\t\t\t\t\n" +
                "\t\t\t\t\t\t\t<!-- END Footer -->\n" +
                "\t\t\t\t\t\t</td>\n" +
                "\t\t\t\t\t</tr>\n" +
                "\t\t\t\t</table>\n" +
                "\t\t\t</td>\n" +
                "\t\t</tr>\n" +
                "\t</table>\n" +
                "</body>\n" +
                "</html>\n");
    }
}
