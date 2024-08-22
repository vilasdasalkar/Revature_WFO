function calculate(operation) {
    const num1 = parseFloat(document.getElementById('num1').value);
    const num2 = parseFloat(document.getElementById('num2').value);
    const resultLabel = document.getElementById('result');
    let result = 0;

    if (isNaN(num1) || isNaN(num2)) {
        resultLabel.innerText = "Please enter valid numbers!";
        resultLabel.style.color = "red";
        return;
    }

    switch (operation) {
        case 'add':
            result = num1 + num2;
            break;
        case 'sub':
            result = num1 - num2;
            break;
        case 'mul':
            result = num1 * num2;
            break;
        case 'div':
            if (num2 === 0) {
                resultLabel.innerText = "Cannot divide by zero!";
                resultLabel.style.color = "red";
                return;
            }
            result = num1 / num2;
            break;
    }

    resultLabel.innerText = "Result: " + result;
    resultLabel.style.color = "#007bff";
}

// Optional: Change background color when an operation is selected
document.querySelectorAll('button').forEach(button => {
    button.addEventListener('click', () => {
        document.body.style.background = randomGradient();
    });
});

function randomGradient() {
    const colors = [
        "#FFDEE9", "#B5FFFC", "#D299FF", "#FDC830", "#F37335", "#2193b0", "#6dd5ed"
    ];
    const randomColor1 = colors[Math.floor(Math.random() * colors.length)];
    const randomColor2 = colors[Math.floor(Math.random() * colors.length)];
    return `linear-gradient(135deg, ${randomColor1}, ${randomColor2})`;
}
