<template>
  <div
    class="bg-white flex flex-row justify-between py-4 px-52 drop-shadow-md h-16 items-center text-center text-lg text-black"
  >
    <div>
      <router-link to="/" class="font-bold text-2xl text-blue-600">
        <!-- TODO 이미지로 대체 -->
        {{ HEADER.LOGO }}
      </router-link>
    </div>
    <div class="menu">
      <ul class="flex gap-4 items-center">
        <li v-for="(item, index) in HEADER.CONTENTS" :key="index">
          <router-link :to="item.LINK">{{ item.TEXT }}</router-link>
        </li>
        <li>
          <button class="bg-blue-600 text-white border rounded-xl px-3 py-1 active:bg-blue-800">
            {{ HEADER.LOGIN }}
          </button>
        </li>
      </ul>
    </div>
    <div class="hamburger_menu">
      <button @click="openMenu">
        <HamburgerMenu />
      </button>
      <ul v-if="viewMenu" class="items">
        <li v-for="(item, index) in HEADER.CONTENTS" :key="index">
          <router-link :to="item.LINK">{{ item.TEXT }}</router-link>
        </li>
        <li>
          <button class="bg-blue-600 text-white border rounded-xl px-3 py-1 active:bg-blue-800">
            {{ HEADER.LOGIN }}
          </button>
        </li>
      </ul>
    </div>
  </div>
</template>

<script setup>
import { HEADER } from '../constants/String';
import HamburgerMenu from '../components/icons/HamburgerMenu.vue';
import { ref } from 'vue';

const viewMenu = ref(false);

const openMenu = () => {
  viewMenu.value = !viewMenu.value;
};
</script>

<style lang="postcss" scoped>
.menu {
  @apply hidden lg:flex;
}

.hamburger_menu {
  @apply lg:hidden flex flex-row gap-4 h-full;
}

.hamburger_menu > .items {
  @apply absolute flex flex-col items-center bg-white translate-y-12;
}

.hamburger_menu > .items > li {
  @apply w-full py-2 px-3 border border-gray-400;
}
</style>
