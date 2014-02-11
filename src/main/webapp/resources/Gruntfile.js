module.exports = function(grunt) {
  grunt.initConfig({
    pkg: grunt.file.readJSON('package.json'),
    ngmin: {
     directives: {
       expand: true,
       src: ['js/**/directives/*.js'],
       dest: 'js/dist'
     },
     controllers: {
       expand: true,
       src: ['js/**/controllers/*.js'],
       dest: 'js/dist'
     },
     filters: {
       expand: true,
       src: ['js/**/filters/*.js'],
       dest: 'js/dist'
     },
     services: {
       expand: true,
       src: ['js/**/services/*.js'],
       dest: 'js/dist'
     },
    },
    uglify: {
      dist: {
        src: 'js/dist/**/*.js',
        dest: 'js/dist/app.js',
        options: {
          sourceMap: true
        }
      }
    },
    sass: {
      dist: {
        files: {
          'css/app.css': 'sass/**/*.scss'
        },
        options: {
          style: 'compact'
        }
      }
    },
    clean: {
      ngmin: {
        src: 'js/dist/*/',
      },
      generated: {
        src: ['css/*.css', 'js/dist/*.js', 'js/dist/*.map']
      }
    }
  });

  grunt.loadNpmTasks('grunt-ngmin');
  grunt.loadNpmTasks('grunt-contrib-sass');
  grunt.loadNpmTasks('grunt-contrib-uglify');
  grunt.loadNpmTasks('grunt-contrib-clean');
  
  grunt.registerTask('default', ['ngmin', 'uglify:dist', 'sass:dist', 'clean:ngmin']);
};
