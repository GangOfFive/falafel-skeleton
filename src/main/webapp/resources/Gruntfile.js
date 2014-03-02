module.exports = function(grunt) {
    grunt.initConfig({
        pkg: grunt.file.readJSON('package.json'),
        prop: grunt.file.readJSON('local.json'),
        jshint: {
            options: {
                jshintrc: '.jshintrc',
                reporter: require('jshint-stylish')
            },
            all: [
                'Gruntfile.js',
                'js/**/*.js',
                '!js/**/dist/**'
            ]
        },
        ngmin: {
            all: {
                expand: true,
                src: ['js/**/*.js', '!js/tmp/**', '!js/**/dist/**'],
                dest: 'js/tmp'
            }
        },
        uglify: {
            dist: {
                src: 'js/tmp/**/*.js',
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
            generated: {
                src: ['css/*.css', 'js/tmp', 'js/dist/*.js', 'js/dist/*.map']
            }
        },
        copy: {
            main: {
                src: ['css/*.css', 'js/**/*', 'images/**/*', 'bower_components/**.*'],
                dest: '<%=prop.tomcat_home%>/<%=prop.app_name%>/resources/',
            }
        },
        watch: {
            js: {
                files: ['js/**/*.js', '!js/tmp/**', '!js/**/dist/**'],
                tasks: [/*'jshint',*/ 'ngmin', 'uglify:dist' /*',copy'*/]
            },
            img: {
                files: ['images/**'],
                tasks: ['copy']
            },
            gruntfile: {
                files: ['Gruntfile.js']
            },
            compass: {
                files: ['sass/**/*.scss'],
                tasks: ['sass:dist'/*, 'copy'*/]
            }
        }
    });

    grunt.loadNpmTasks('grunt-ngmin');
    grunt.loadNpmTasks('grunt-contrib-sass');
    grunt.loadNpmTasks('grunt-contrib-uglify');
    grunt.loadNpmTasks('grunt-contrib-clean');
    grunt.loadNpmTasks('grunt-contrib-watch');
    grunt.loadNpmTasks('grunt-contrib-jshint');
    grunt.loadNpmTasks('grunt-contrib-copy');

    grunt.registerTask('build', [/*'jshint',*/ 'ngmin', 'uglify:dist', 'sass:dist', 'copy']);
};
