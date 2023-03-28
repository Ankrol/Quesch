<template>
  <div class="home">
    <a href="#" class="btn" role="button">Link</a>
    <button class="btn">Button</button>
    <input type="button" class="btn" value="Input" />
    <input type="submit" class="btn" value="Submit" />
    <input type="reset" class="btn" value="Reset" />
    <img alt="Vue logo" src="../assets/logo.png">
    <HelloWorld msg="Welcome to Your Vue.js + TypeScript App"/>
  </div>
</template>

<script lang="ts">
import { defineComponent } from 'vue';
import HelloWorld from '@/components/HelloWorld.vue'; // @ is an alias to /src
export default defineComponent({
  name: 'HomeView',
  components: {
    HelloWorld,
  },
});
</script>


