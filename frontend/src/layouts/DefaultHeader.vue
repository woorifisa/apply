<template>
  <div
    class="bg-white flex flex-row justify-between py-4 px-52 drop-shadow-md h-16 items-center text-center text-lg"
  >
    <div>
      <router-link to="/" class="font-bold text-2xl text-blue-600">
        <!-- TODO 이미지로 대체 -->
        {{ HEADER.LOGO }}
      </router-link>
    </div>
    <ul class="flex flex-row gap-4 items-center">
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
</template>

<script setup>
import { HEADER } from '../constants/String';
</script>

<style scoped></style>
