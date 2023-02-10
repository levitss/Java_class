package kr.co.ezenac.string;

public class StringBlockTest {
	public static void main(String[] args) {
		String s="""
				sesst
				etse
				test
				""";
		System.out.println(s);
		String te="s";
		String ss=new String("s");
		ss.intern();
		System.out.println(te==ss);
		
		
	}
	public static String getHtmlBlock(){
		return """
<!doctype html>
<html dir="ltr" lang="ko">
<head>
<meta charset="utf-8">
<title>새 탭</title>
<style>
  body {
    background: #FFFFFF;
    margin: 0;
  }

  #backgroundImage {
    border: none;
    height: 100%;
    pointer-events: none;
    position: fixed;
    top: 0;
    visibility: hidden;
    width: 100%;
  }

  [show-background-image] #backgroundImage {
    visibility: visible;
  }
</style>
</head>
<body>
<iframe id="backgroundImage" src=""></iframe>
<ntp-app></ntp-app>
<script type="module" src="new_tab_page.js"></script>
<link rel="stylesheet" href="chrome://resources/css/text_defaults_md.css">
<link rel="stylesheet" href="chrome://theme/colors.css?sets=ui,chrome">
<link rel="stylesheet" href="shared_vars.css">
</body>
</html>

""";
	}
}
