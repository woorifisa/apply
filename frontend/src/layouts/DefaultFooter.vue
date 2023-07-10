<template>
  <div class="relative translate-y-full flex w-full h-96 px-52 bg-slate-600 text-white">
    <div class="w-full">
      <p class="my-12 text-3xl">
        {{ FOOTER.LOGO }}
      </p>
      <hr />
      <div class="flex flex-row w-full">
        <div class="wrap">
          <span>{{ FOOTER.CONTACT.TITLE }}</span>
          <ul class="items">
            <li v-for="(item, index) in FOOTER.CONTACT.CONTENTS" :key="index">
              <!-- <span>{{ item.TYPE }}</span> -->
              <span>{{ item.VALUE }}</span>
            </li>
          </ul>
        </div>
        <div class="wrap">
          <span>{{ FOOTER.LINKS.TITLE }}</span>
          <ul class="items">
            <li v-for="(item, index) in FOOTER.LINKS.CONTENTS" :key="index">
              <span>
                <router-link :to="item.LINK"> {{ item.TITLE }}</router-link>
              </span>
            </li>
          </ul>
        </div>
      </div>
    </div>
  </div>
</template>

<script setup>
import { FOOTER } from '../constants/String';
</script>

<style lang="postcss" scoped>
.wrap {
  @apply flex w-1/2 flex-col;
}
.wrap > span {
  @apply mb-4 mt-2;
}
.items {
  @apply flex flex-col gap-1;
}
</style>
