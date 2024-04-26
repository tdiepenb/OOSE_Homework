let person = {
    firstName: "Caro",
    lastName: "Jungheim",
    age: 23,
}

let professorRole = {
    position: "full professor",
    level: "W1",
    chair: "Information Systems",
    getDescription() {
        return `${this.firstName} ${this.lastName} works at ${this.chair}`
    },
    getInfo() {
        return `${this.getDescription()} is at level ${this.level} with the position ${this.position}`
    }
}

let examinationHead = {
    __proto__: professorRole,
    getInfo() {
        return `${this.__proto__.getInfo()} and has the title Head of the examination board`
    },
    getDescription() {
        return `${this.__proto__.getDescription()} and has the title Head of the examination board`
    }
}

let departmentHead = {
    __proto__: professorRole,
    getInfo() {
        return `${this.__proto__.getInfo()} and has the title Head of the Department`
    },
    getDescription() {
        return `${this.__proto__.getDescription()} and has the title Head of the Department`
    }
}





function clone(object) {
    let clone = {};
    for(let key in object) {
        clone[key] = object[key];
    }
    return clone;
}

