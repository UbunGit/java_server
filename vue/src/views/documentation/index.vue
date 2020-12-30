<template>
  <div class="app-container documentation-container">
    <a class="document-btn" target="_blank" href="https://springboot.plus/">springbootplus</a>
    <a class="document-btn" target="_blank" href="https://github.com/geekidea/spring-boot-plus">Github spring-boot-plus</a>
  </div>
</template>

<script>

export default {
  name: 'Documentation',
  data() {
    return {
    }
  }
}
</script>

<style lang="scss" scoped>
.documentation-container {
  margin: 50px;
  display: flex;
  flex-wrap: wrap;
  justify-content: space-evenly;

  .document-btn {
    flex-shrink: 0;
    display: block;
    cursor: pointer;
    background: #1890ff;
    color: white;
    height: 60px;
    width: 200px;
    margin-bottom: 16px;
    line-height: 60px;
    font-size: 20px;
    text-align: center;
  }
}
</style>
