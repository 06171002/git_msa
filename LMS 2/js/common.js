$(document).ready(function () {
  $(".main_menu > li > a").click(function () {
    $(this).next($(".snd_menu")).slideToggle("fast");
  });
  $(".snd_menu > li > a").click(function (e) {
    e.stopPropagation();
    $(this).next($(".trd_menu")).slideToggle("fast");
  });

  // 버튼 클릭 시 색 변경
  $(".snd_menu > li > a").focus(function () {
    $(this).addClass("select");
  });
  $(".snd_menu > li > a").blur(function () {
    $(this).removeClass("select");
  });
});
