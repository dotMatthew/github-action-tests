module.exports = {
    branches: [
        { name: "main", prerelease: false },
        { name: "feature/*", prerelease: '${name.replace(/^feature\\//g, "feat-")}' },
        { name: "release/*", prerelease: '${name.replace(/^release\\//g, "rc-")}' },
        { name: "hotfix/*", prerelease: '${name.replace(/^hotfix\\//g, "hotfix-")}' },
        { name: "fix/*", prerelease: '${name.replace(/^fix\\//g, "fix-")}' }
    ],
    plugins: [
        "@semantic-release/commit-analyzer",
        "@semantic-release/release-notes-generator",
        "@semantic-release/github"
    ]
};
