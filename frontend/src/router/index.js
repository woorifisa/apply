import { createRouter, createWebHistory } from 'vue-router';
import HomeView from '../views/HomeView.vue';
import CourseView from '../views/CourseView.vue';
import ApplyView from '../views/ApplyView.vue';
import RecruitView from '../views/RecruitView.vue';
import ContactView from '../views/ContactView.vue';
import DefaultLayout from '../layouts/DefaultLayout.vue';

const router = createRouter({
  history: createWebHistory(import.meta.env.BASE_URL),
  routes: [
    {
      path: '/',
      name: 'defaultLayout',
      component: DefaultLayout,
      children: [
        {
          path: '/',
          name: 'home',
          component: HomeView
        },
        {
          path: '/course',
          name: 'course',
          component: CourseView
        },
        {
          path: '/recruit',
          name: 'recruit',
          component: RecruitView
        },
        {
          path: '/apply',
          name: 'apply',
          component: ApplyView,
          meta: {
            authRequired: true
          }
        },
        {
          path: '/contact',
          name: 'contact',
          component: ContactView
        }
      ]
    }
    // import 다른 버전
    // {
    //   path: '/about',
    //   name: 'about',
    //   // route level code-splitting
    //   // this generates a separate chunk (About.[hash].js) for this route
    //   // which is lazy-loaded when the route is visited.
    //   component: () => import('../views/AboutView.vue')
    // }
  ]
});

router.beforeEach((to, from, next) => {
  // TODO: 로그인 확인함수 구현 시 적용
  // 로그인이 필요한 페이지이고 로그인을 한 경우에만 페이지 이동
  if (to.matched.some((value) => value.meta.authRequired)) {
    alert('로그인이 필요합니다!');
  }
  next();
});

export default router;
