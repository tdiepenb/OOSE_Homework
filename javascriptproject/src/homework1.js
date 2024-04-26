function clone(object) {
    let clone = {};
    for(let key in object) {
        clone[key] = object[key];
    }
    return clone;
}

let caroJungheim = {
    firstName: "Caro",
    lastName: "Jungheim",
    age: 23,
}

let professorRole = {
    position: "",
    level: "",
    chair: "",
    getDescription() {
        return `${this.firstName} ${this.lastName} works at ${this.chair}`
    },
    getInfo() {
        return `${this.getDescription()} is at level ${this.level} with the position ${this.position}`
    }
}

function makeProfessor(person, position, level, chair) {
    let c = clone(professorRole);
    c.position = position;
    c.level = level;
    c.chair = chair;
    c.__proto__ = person;
    return c;
}

let profCaroJungheim = makeProfessor(caroJungheim, "full Professor", "W2", "Software Engineering")


let examinationHead = {
    getInfo() {
        return `${this.__proto__.getInfo()} and has the title Head of the examination board`
    },
    getDescription() {
        return `${this.__proto__.getDescription()} and has the title Head of the examination board`
    }
}

let departmentHead = {
    getInfo() {
        return `${super.getInfo()} and has the title Head of the Department`
    },
    getDescription() {
        return `${super.getDescription()} and has the title Head of the Department`
    }
}

function makeExaminationHead(professor) {
    let c = clone(examinationHead);
    c.__proto__ = professor;
    return c
}

function makeDepartmentHead(professor) {
    let c = clone(departmentHead);
    c.__proto__ = professor;
    return c
}


let examinationHeadCaroJungheim = makeExaminationHead(profCaroJungheim)
let departmentHeadCaroJungheim = makeDepartmentHead(profCaroJungheim)

console.log(examinationHeadCaroJungheim.getInfo())
// console.log(departmentHeadCaroJungheim.getInfo())
