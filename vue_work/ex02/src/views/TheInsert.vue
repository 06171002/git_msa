<template>
    <div>
        <h1>Insert</h1>
        <button @click="userSend">전송</button>

    </div>
</template>

<script>
export default {
    setup () {
        const mydata = {
            
            "name": "Lee",
            "age": 10,
            "email": "asdf",
            "password": "1234",
            "createDate": "2024-09-06T11:18:50.210237"

        }
        const userSend = () => {
            fetch('http://localhost:8080/user/insert',{
            method: "POST",
            headers:{'Content-Type':'application/json'},
            body: JSON.stringify(mydata)
        })
        .then( res => {
            console.log(res);
        })
        }
    
        

        return {userSend}
    }
}
</script>

<style lang="scss" scoped>

</style>