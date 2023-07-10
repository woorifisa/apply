<template>
  <div>
    <DefaultHeader />
    <router-view />
    <DefaultFooter />
  </div>
</template>

<script setup>
import DefaultHeader from './DefaultHeader.vue';
import DefaultFooter from './DefaultFooter.vue';
</script>

<style lang="scss" scoped></style>
