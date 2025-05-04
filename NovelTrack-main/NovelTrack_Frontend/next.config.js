module.exports = {
    webpack: (config) => {
      config.resolve.fallback = {
        process: require.resolve('process/browser'),
      };
      return config;
    },
  };
  