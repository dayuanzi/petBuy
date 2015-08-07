var timeout = 100;
var closetimer = 0;
var ddmenuitem = 0;

function menu_open() {
	menu_canceltimer();
	menu_close();
	ddmenuitem = $(this).find('ul').eq(0).css('visibility', 'visible');
}

function menu_close() {
	if (ddmenuitem)
		ddmenuitem.css('visibility', 'hidden');
}

function menu_timer() {
	closetimer = window.setTimeout(menu_close, timeout);
}

function menu_canceltimer() {
	if (closetimer) {
		window.clearTimeout(closetimer);
		closetimer = null;
	}
}
$(document).ready(function() {
	$('.header-menu > li').bind('mouseover', menu_open);
	$('.header-menu > li').bind('mouseout', menu_timer);
});
document.onclick = menu_close;
