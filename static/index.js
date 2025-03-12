(function(){function r(e,n,t){function o(i,f){if(!n[i]){if(!e[i]){var c="function"==typeof require&&require;if(!f&&c)return c(i,!0);if(u)return u(i,!0);var a=new Error("Cannot find module '"+i+"'");throw a.code="MODULE_NOT_FOUND",a}var p=n[i]={exports:{}};e[i][0].call(p.exports,function(r){var n=e[i][1][r];return o(n||r)},p,p.exports,r,e,n,t)}return n[i].exports}for(var u="function"==typeof require&&require,i=0;i<t.length;i++)o(t[i]);return o}return r})()({1:[function(require,module,exports){
"use strict";
Object.defineProperty(exports, "__esModule", { value: true });
const title_generator_1 = require("./title_generator");
const splash_1 = require("./splash");
const wallpaper_1 = require("./wallpaper");
function initNavBar() {
    const navbar = document.querySelector(".navbar");
    const navbarInner = document.querySelector(".navbar__inner");
    if (navbar === null) {
        throw new Error("navbar inner");
    }
    if (navbarInner === null) {
        throw new Error("navbar inner missing");
    }
    const sticky = navbar.offsetTop;
    console.log("sticky", sticky);
    document.addEventListener("DOMContentLoaded", () => {
        const headers = document.querySelectorAll("h2[id]");
        for (let i = 0; i < headers.length; i++) {
            const header = headers[i];
            console.log("header");
            const button = document.createElement("BUTTON");
            navbarInner.appendChild(button);
            button.innerText = header.getAttribute("data-text") || header.innerText;
            button.className = "navbar__inner__button";
            button.addEventListener("click", () => {
                window.location.href = `#${header.id}`;
                setTimeout(() => {
                    console.log("scroll to header", header);
                    header.scrollIntoView({
                        behavior: "smooth",
                    });
                }, 100);
            });
        }
    });
    function updateNavbarStatus() {
        if (navbar === null) {
            throw new Error("navbar inner");
        }
        if (window.scrollY >= sticky) {
            navbar.classList.add("navbar--sticky");
        }
        else {
            navbar.classList.remove("navbar--sticky");
        }
    }
    document.addEventListener('scroll', () => {
        updateNavbarStatus();
    });
    updateNavbarStatus();
}
(() => {
    console.log("hello");
    (0, splash_1.initSplash)();
    (0, wallpaper_1.initWallpaper)();
    (0, title_generator_1.initTitleGenerator)();
    initNavBar();
    window.addEventListener("beforeprint", () => {
        console.log('This will be called before the user prints.');
        const elements = document.body.getElementsByTagName("*");
        for (let i = 0; i < elements.length; i++) {
            const element = elements[i];
            element.style.opacity = "1";
        }
    });
})();

},{"./splash":2,"./title_generator":3,"./wallpaper":4}],2:[function(require,module,exports){
"use strict";
Object.defineProperty(exports, "__esModule", { value: true });
exports.initSplash = void 0;
function initSplash() {
    const headers = document.querySelectorAll(".splash__header");
    for (let i = 0; i < headers.length; i++) {
        const header = headers[i];
        const text = " " + header.innerText + " ";
        header.innerText = "";
        for (let ti = 0; ti < text.length; ti++) {
            const span = document.createElement("SPAN");
            header.appendChild(span);
            span.innerText = text.charAt(ti);
            setTimeout(() => {
                span.classList.add("animation-reveal");
            }, (i * 3000) + (ti * 70));
        }
    }
    const elemAuthor = document.querySelector(".splash__author");
    if (elemAuthor === null) {
        return;
    }
    const textAuthor = " " + elemAuthor.innerText + " ";
    elemAuthor.innerText = "";
    for (let i = 0; i < textAuthor.length; i++) {
        const span = document.createElement("SPAN");
        elemAuthor.appendChild(span);
        span.innerText = textAuthor.charAt(i);
        setTimeout(() => {
            span.classList.add("animation-reveal");
        }, (5.5 * 1000) + (i * 70));
    }
}
exports.initSplash = initSplash;

},{}],3:[function(require,module,exports){
"use strict";
Object.defineProperty(exports, "__esModule", { value: true });
exports.initTitleGenerator = void 0;
function initTitleGenerator() {
    const TIMEOUT_KEY_PRESS = 90;
    console.log("init title generator");
    function onUpdate() {
        const elemTitle = document.querySelector(".profile-section__title span:first-child");
        if (elemTitle === null) {
            throw new Error("Profile section title missing");
        }
        const backtrack = elemTitle.innerText.length - 30;
        for (let i = 0; i < backtrack; i++) {
            setTimeout(() => {
                elemTitle.innerText = elemTitle.innerText.substr(0, elemTitle.innerText.length - 1);
            }, i * TIMEOUT_KEY_PRESS);
        }
        const textArray = [
            'am a software developer',
            'a web developer',
            'am a full stack developer',
            'am a software consultant',
            'am a software architect',
            'am an indie game developer',
            'am an Internet addict',
            'like to build stuff',
            'come up with solutions to problems.',
        ];
        const randomNumber = Math.floor(Math.random() * textArray.length);
        const item = textArray[randomNumber] + ".";
        for (let i = 0; i < item.length; i++) {
            const fragment = item.substr(0, i + 1);
            setTimeout(() => {
                elemTitle.innerText = `My name is Christoffer and I ${fragment}`;
            }, (backtrack * TIMEOUT_KEY_PRESS) + i * TIMEOUT_KEY_PRESS);
        }
    }
    setInterval(() => {
        onUpdate();
    }, 1000 * 10);
    setTimeout(() => {
        onUpdate();
    }, 4000);
    const elemCursor = document.querySelector(".profile-section__title span:last-child");
    if (elemCursor === null) {
        throw new Error("Profile section cursor missing");
    }
    setInterval(() => {
        elemCursor.style.opacity = elemCursor.style.opacity === "0" ? "1" : "0";
    }, 530);
}
exports.initTitleGenerator = initTitleGenerator;

},{}],4:[function(require,module,exports){
"use strict";
Object.defineProperty(exports, "__esModule", { value: true });
exports.initWallpaper = void 0;
function initWallpaper() {
    const wallpaper = document.querySelector(".wallpaper");
    if (wallpaper === null) {
        throw new Error("unknown wallpaper element");
    }
    function updateWallpaperBlur() {
        if (wallpaper === null) {
            throw new Error("unknown wallpaper element");
        }
        const blur = Math.min((window.scrollY / 100), 25);
        wallpaper.style.filter = `blur(${blur}px`;
    }
    document.addEventListener('scroll', () => {
        updateWallpaperBlur();
    });
    updateWallpaperBlur();
}
exports.initWallpaper = initWallpaper;

},{}]},{},[1]);
