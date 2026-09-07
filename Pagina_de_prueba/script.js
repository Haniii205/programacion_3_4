//gsap.registerPlugin(ScrollTrigger);
const cards = document.querySelectorAll('.card');

//document.addEventListener('DOMContentLoaded', () => {
//    cards.forEach((card, index) => {
//        if (index === cards.length - 1) return;

//        gsap.from(card, {
//            y: 50,
            x: index % 2 === 0 ? -20 : 20,
            opacity: 0.4,
            scrollTrigger: {
                trigger: card,
                start: 'top 90%',
                end: 'top center',
                scrub: true,
            }
        });
    });
});