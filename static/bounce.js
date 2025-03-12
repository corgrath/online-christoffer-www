// (() => {
//
//     console.log("Starting JavaScript");
//
//     function isInViewport( element ) {
// //         const top = (window.innerHeight * 0.50) + window.scrollY;
//         const top = (window.innerHeight * 0.50) + window.scrollY;
// //         const top = (window.innerHeight / 2) + window.scrollY;
//         console.log("scrollTop=", window.scrollY)
//         console.log("innerHeight=", window.innerHeight)
//         console.log("top=", top)
//         const rect = element.getBoundingClientRect();
//         console.log("rect.top=", rect.top)
//         return (window.innerHeight * 0.75) > rect.top;
// //         return (
// //             rect.top >= 0 &&
// //             rect.left >= 0 &&
// //             rect.bottom <= (window.innerHeight || document.documentElement.clientHeight) &&
// //             rect.right <= (window.innerWidth || document.documentElement.clientWidth)
// //         );
//     }
//
//     function getRandomItem( arr ) {
//         const randomIndex = Math.floor(Math.random() * arr.length);
//         return arr[randomIndex];
//     }
//
//     const cards = document.querySelectorAll(".card, .tag")
//     for( let i = 0; i < cards.length; i++ ) {
//         const card = cards[i]
//         if( isInViewport(card) ) {
//             card.classList.add("animation-scale-up");
//         } else {
//             card.style.opacity = "0";
//         }
//     }
//
//     /*
//      * Init
//      */
//
//     document.addEventListener('scroll', function () {
//
//         const cards = document.querySelectorAll(".card, .tag")
//         console.log("cards");
//
//         let time = 0;
//         for( let i = 0; i < cards.length; i++ ) {
//             const card = cards[i]
//
//             console.log("card.style.opacity", card.style.opacity, typeof card.style.opacity)
//             if( isInViewport(card) && !card.className.includes("animation") ) {
// //                 const c = getRandomItem(["animation-scale-up", "animation-scale-left"])
//                 const c = getRandomItem(["animation-scale-up"])
//                 setTimeout(() => {
//                     card.classList.add(c);
//                 }, (time++) * 50)
//
//             }
//
//         }
//
//     }, {
//         passive: true
//     });
//
// })()